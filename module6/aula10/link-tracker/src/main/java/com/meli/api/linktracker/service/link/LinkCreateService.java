package com.meli.api.linktracker.service.link;

import com.meli.api.linktracker.dto.LinkDTO;
import com.meli.api.linktracker.dto.mapper.LinkMapper;
import com.meli.api.linktracker.entity.Link;
import com.meli.api.linktracker.form.LinkForm;
import com.meli.api.linktracker.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkCreateService {
    private final LinkRepository linkRepository;

    @Autowired
    public LinkCreateService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public LinkDTO createLink(LinkForm linkForm) {
        Link newLink = new Link(linkRepository.getList().size() + 1, linkForm.getUrl());

        linkRepository.addLink(newLink);

        return LinkMapper.convert(newLink);
    }
}
