package com.mailchimp.domain.promo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mailchimp.domain.Link;

public class PromoCode {

    private String id;
    private String code;
    @JsonProperty("redemption_url")
    private String redemptionUrl;
    @JsonProperty("usage_count")
    private Integer usageCount;
    private Boolean enabled;
    @JsonProperty("created_at_foreign")
    private String createdAtForeign;
    @JsonProperty("updated_at_foreign")
    private String updatedAtForeign;
    @JsonProperty("_links")
    private List<Link> links;

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getRedemptionUrl() {
        return redemptionUrl;
    }

    public Integer getUsageCount() {
        return usageCount;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public String getCreatedAtForeign() {
        return createdAtForeign;
    }

    public String getUpdatedAtForeign() {
        return updatedAtForeign;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public void setRedemptionUrl(final String redemptionUrl) {
        this.redemptionUrl = redemptionUrl;
    }

    public void setUsageCount(final int usageCount) {
        this.usageCount = usageCount;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    public void setCreatedAtForeign(final String createdAtForeign) {
        this.createdAtForeign = createdAtForeign;
    }

    public void setUpdatedAtForeign(final String updatedAtForeign) {
        this.updatedAtForeign = updatedAtForeign;
    }

    public void setLinks(final List<Link> links) {
        this.links = links;
    }
}
