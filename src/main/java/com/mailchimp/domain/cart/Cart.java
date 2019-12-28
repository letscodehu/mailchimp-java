package com.mailchimp.domain.cart;

import java.util.List;

import com.mailchimp.domain.customer.Customer;

public class Cart {

    private String id;
    private Customer customer;
    private long orderTotal;
    private String checkoutUrl;
    private String campaignId;
    private String currencyCode;
    private long taxTotal;
    private List<CartLine> lines;

    public String getId() {
        return id;
    }

    public Cart setId(final String id) {
        this.id = id;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Cart setCustomer(final Customer customer) {
        this.customer = customer;
        return this;
    }

    public long getOrderTotal() {
        return orderTotal;
    }

    public Cart setOrderTotal(final long orderTotal) {
        this.orderTotal = orderTotal;
        return this;
    }

    public String getCheckoutUrl() {
        return checkoutUrl;
    }

    public Cart setCheckoutUrl(final String checkoutUrl) {
        this.checkoutUrl = checkoutUrl;
        return this;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public Cart setCampaignId(final String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public Cart setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public long getTaxTotal() {
        return taxTotal;
    }

    public Cart setTaxTotal(final long taxTotal) {
        this.taxTotal = taxTotal;
        return this;
    }

    public List<CartLine> getLines() {
        return lines;
    }

    public Cart setLines(final List<CartLine> lines) {
        this.lines = lines;
        return this;
    }
}
