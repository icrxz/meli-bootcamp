package com.meli.api.linktracker.service.link;

import com.meli.api.linktracker.entity.Link;
import com.meli.api.linktracker.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.RedirectView;

@Service
public class LinkRedirectService {
    private final LinkSearchService linkSearchService;

    @Autowired
    public LinkRedirectService(LinkSearchService linkSearchService) {
        this.linkSearchService = linkSearchService;
    }

    public RedirectView redirectLink(int linkId) {
        RedirectView redirectView = new RedirectView();
        Link foundLink = linkSearchService.searchLink(linkId);

        redirectView.setUrl(foundLink.getUrl());
        foundLink.addAccess();

        return redirectView;
    }
}
