package com.meli.api.linktracker.service.link;

import com.meli.api.linktracker.entity.Link;
import com.meli.api.linktracker.exception.LinkNotFoundException;
import com.meli.api.linktracker.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkInvalidateService {
    private final LinkRepository linkRepository;

    @Autowired
    public LinkInvalidateService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public void invalidateService(int linkId) {
        Link removedLink = linkRepository.deleteLink(linkId);

        if (removedLink == null)
            throw new LinkNotFoundException("Nao existe esse link para ser removido");
    }
}
