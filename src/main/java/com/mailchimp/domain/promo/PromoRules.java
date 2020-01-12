package com.mailchimp.domain.promo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mailchimp.domain.Link;

public class PromoRules {

    @JsonProperty("promo_rules")
    private List<PromoRule> promoRules;

    @JsonProperty("total_items")
    private Integer totalItems;

    @JsonProperty("_links")
    private List<Link> links;

    public List<PromoRule> getPromoRules() {
        return promoRules;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setPromoRules(final List<PromoRule> promoRules) {
        this.promoRules = promoRules;
    }

    public void setTotalItems(final Integer totalItems) {
        this.totalItems = totalItems;
    }

    public void setLinks(final List<Link> links) {
        this.links = links;
    }
}
