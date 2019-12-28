package com.mailchimp.domain.store;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mailchimp.domain.Link;

public class Stores {

    @JsonProperty("stores")
    private List<Store> stores;

    @JsonProperty("total_items")
    private Integer totalItems;

    @JsonProperty("_links")
    private List<Link> links;

    public List<Store> getStores() {
        return stores;
    }

    public Stores setStores(final List<Store> stores) {
        this.stores = stores;
        return this;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public Stores setTotalItems(final Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }

    public List<Link> getLinks() {
        return links;
    }

    public Stores setLinks(final List<Link> links) {
        this.links = links;
        return this;
    }
}
