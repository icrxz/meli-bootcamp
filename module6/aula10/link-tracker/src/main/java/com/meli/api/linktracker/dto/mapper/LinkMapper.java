package com.meli.api.linktracker.dto.mapper;

import com.meli.api.linktracker.dto.LinkDTO;
import com.meli.api.linktracker.entity.Link;

public class LinkMapper {
    public static LinkDTO convert (Link link) {
        return new LinkDTO(link);
    }

    public static Link convert (LinkDTO linkDTO) {
        Link link = new Link();

        link.setId(linkDTO.getId());

        return link;
    }
}
