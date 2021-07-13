package com.meli.api.linktracker.controller;

import com.meli.api.linktracker.dto.LinkDTO;
import com.meli.api.linktracker.form.LinkForm;
import com.meli.api.linktracker.service.link.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;

@RestController
@RequestMapping
public class LinkController {
    private final LinkCreateService linkCreateService;
    private final LinkRedirectService linkRedirectService;
    private final LinkMetricsService linkMetricsService;
    private final LinkInvalidateService linkInvalidateService;

    @Autowired
    public LinkController(
            LinkCreateService linkCreateService,
            LinkRedirectService linkRedirectService,
            LinkMetricsService linkMetricsService,
            LinkInvalidateService linkInvalidateService
    ) {
        this.linkCreateService = linkCreateService;
        this.linkRedirectService = linkRedirectService;
        this.linkMetricsService = linkMetricsService;
        this.linkInvalidateService = linkInvalidateService;
    }

    @PostMapping("/link")
    public ResponseEntity<LinkDTO> createLink(@RequestBody @Valid LinkForm link) {
        LinkDTO createdLink =  linkCreateService.createLink(link);

        return ResponseEntity.ok(createdLink);
    }

    @GetMapping("/link/{linkId}")
    public RedirectView redirectLink(@PathVariable int linkId) {
        RedirectView redirectLink = linkRedirectService.redirectLink(linkId);

        return redirectLink;
    }

    @GetMapping("/metrics/{linkId}")
    public ResponseEntity<Integer> linkMetrics(@PathVariable int linkId) {
        int linkAccesses = linkMetricsService.getLinkMetrics(linkId);

        return ResponseEntity.ok(Integer.valueOf(linkAccesses));
    }

    @PostMapping("/invalidate/{linkId}")
    public ResponseEntity invalidateLink(@PathVariable int linkId) {
        linkInvalidateService.invalidateService(linkId);

        return ResponseEntity.ok().build();
    }
}
