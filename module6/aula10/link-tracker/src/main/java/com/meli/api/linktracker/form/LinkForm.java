package com.meli.api.linktracker.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LinkForm {
    @NotNull
    @NotEmpty
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
