package com.meli.api.linktracker.entity;

public class Link {
    private int id;
    private String url;
    private int accesses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAccesses() {
        return accesses;
    }

    public void setAccesses(int accesses) {
        this.accesses = accesses;
    }

    public void addAccess() {
        this.accesses++;
    }

    public Link() {
    }

    public Link(int id, String url) {
        this.id = id;
        this.url = url;
    }
}
