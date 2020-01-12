package com.mailchimp.domain.promo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mailchimp.domain.Link;

public class PromoCodes {

    @JsonProperty("promo_codes")
    private List<PromoCode> promoCodes;
    @JsonProperty("_links")
    private List<Link> links;
    @JsonProperty("total_items")
    private int totalItems;
    @JsonProperty("store_id")
    private String storeId;

    public List<PromoCode> getPromoCodes() {
        return promoCodes;
    }

    public void setPromoCodes(final List<PromoCode> promoCodes) {
        this.promoCodes = promoCodes;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(final int totalItems) {
        this.totalItems = totalItems;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(final String storeId) {
        this.storeId = storeId;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(final List<Link> links) {
        this.links = links;
    }
}
