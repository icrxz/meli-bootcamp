package com.meli.api.linktracker.dto;

import com.meli.api.linktracker.entity.Link;

public class LinkDTO {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LinkDTO() {
    }

    public LinkDTO(Link link) {
        this.id = link.getId();
    }
}
