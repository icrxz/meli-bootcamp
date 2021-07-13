package com.meli.api.linktracker.service.link;

import com.meli.api.linktracker.entity.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkMetricsService {
    private final LinkSearchService linkSearchService;

    @Autowired
    public LinkMetricsService(LinkSearchService linkSearchService) {
        this.linkSearchService = linkSearchService;
    }

    public int getLinkMetrics(int id) {
        Link foundLink = linkSearchService.searchLink(id);

        return foundLink.getAccesses();
    }
}
