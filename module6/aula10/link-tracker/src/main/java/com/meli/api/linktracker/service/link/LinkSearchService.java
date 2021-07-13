package com.meli.api.linktracker.service.link;

import com.meli.api.linktracker.entity.Link;
import com.meli.api.linktracker.exception.LinkNotFoundException;
import com.meli.api.linktracker.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkSearchService {
    private final LinkRepository linkRepository;

    @Autowired
    public LinkSearchService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public Link searchLink(int id) {
        Link foundLink = linkRepository.getLink(id);

        if (foundLink == null)
            throw new LinkNotFoundException("URL não encontrada");

        return foundLink;
    }
}
