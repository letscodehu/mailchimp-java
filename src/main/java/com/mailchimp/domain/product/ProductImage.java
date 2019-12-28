package com.mailchimp.domain.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductImage {

    private String id;
    private String url;
    @JsonProperty("variant_ids")
    private List<String> variantIds;

    public String getId() {
        return id;
    }

    public ProductImage setId(final String id) {
        this.id = id;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ProductImage setUrl(final String url) {
        this.url = url;
        return this;
    }

    public List<String> getVariantIds() {
        return variantIds;
    }

    public ProductImage setVariantIds(final List<String> variantIds) {
        this.variantIds = variantIds;
        return this;
    }
}
