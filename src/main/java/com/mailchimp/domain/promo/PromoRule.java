package com.mailchimp.domain.promo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mailchimp.domain.Link;

public class PromoRule {

    private String id;
    private String title;
    private String description;
    private String startsAt;
    private String endsAt;
    private Float amount;
    private PromoRuleCreate.Type type;
    private PromoRuleCreate.Target target;
    private Boolean enabled;
    private String createdAtForeign;
    private String updatedAtForeign;
    @JsonProperty("_links")
    private List<Link> links;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(final String startsAt) {
        this.startsAt = startsAt;
    }

    public String getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(final String endsAt) {
        this.endsAt = endsAt;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(final float amount) {
        this.amount = amount;
    }

    public PromoRuleCreate.Type getType() {
        return type;
    }

    public void setType(final PromoRuleCreate.Type type) {
        this.type = type;
    }

    public PromoRuleCreate.Target getTarget() {
        return target;
    }

    public void setTarget(final PromoRuleCreate.Target target) {
        this.target = target;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public String getCreatedAtForeign() {
        return createdAtForeign;
    }

    public void setCreatedAtForeign(final String createdAtForeign) {
        this.createdAtForeign = createdAtForeign;
    }

    public String getUpdatedAtForeign() {
        return updatedAtForeign;
    }

    public void setUpdatedAtForeign(final String updatedAtForeign) {
        this.updatedAtForeign = updatedAtForeign;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(final List<Link> links) {
        this.links = links;
    }
}
