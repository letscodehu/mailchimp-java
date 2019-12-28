package com.mailchimp.domain.customer;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mailchimp.domain.Link;

import lombok.Data;

@Data
public class Customers {

    @JsonProperty("customers")
    private List<Customer> customers;

    @JsonProperty("total_items")
    private Integer totalItems;

    @JsonProperty("_links")
    private List<Link> links;

    public List<Customer> getCustomers() {
        return customers;
    }

    public Customers setCustomers(final List<Customer> customers) {
        this.customers = customers;
        return this;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public Customers setTotalItems(final Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }

    public List<Link> getLinks() {
        return links;
    }

    public Customers setLinks(final List<Link> links) {
        this.links = links;
        return this;
    }
}
