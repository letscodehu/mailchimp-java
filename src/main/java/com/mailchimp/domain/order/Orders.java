package com.mailchimp.domain.order;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mailchimp.domain.Link;

public class Orders {

    private List<Order> orders;

    @JsonProperty("total_items")
    private Integer totalItems;

    @JsonProperty("_links")
    private List<Link> links;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(final List<Order> orders) {
        this.orders = orders;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(final Integer totalItems) {
        this.totalItems = totalItems;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(final List<Link> links) {
        this.links = links;
    }
}
