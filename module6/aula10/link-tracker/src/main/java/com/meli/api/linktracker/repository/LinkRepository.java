package com.meli.api.linktracker.repository;

import com.meli.api.linktracker.entity.Link;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LinkRepository {
    private static List<Link> linkList = new ArrayList<>();

    public List<Link> getList() {
        return linkList;
    }

    public void addLink(Link link) {
        linkList.add(link);
    }

    public Link getLink(int id) {
        return linkList.stream().filter(link -> link.getId() == id).findFirst().orElse(null);
    }

    public Link deleteLink(int id) {
        Link removedLink = this.getLink(id);

        linkList.removeIf(link -> link.getId() == id);

        return removedLink;
    }
}
