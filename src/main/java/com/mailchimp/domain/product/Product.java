package com.mailchimp.domain.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {

    private String id;
    private String title;
    private String handle;
    private String url;
    private String description;
    private String type;
    private String vendor;
    @JsonProperty("image_url")
    private String imageUrl;
    private List<ProductVariant> variants;
    private List<ProductImage> images;
    @JsonProperty("published_at_foreign")
    private String publishedAtForeign;

    public String getId() {
        return id;
    }

    public Product setId(final String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Product setTitle(final String title) {
        this.title = title;
        return this;
    }

    public String getHandle() {
        return handle;
    }

    public Product setHandle(final String handle) {
        this.handle = handle;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Product setUrl(final String url) {
        this.url = url;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Product setDescription(final String description) {
        this.description = description;
        return this;
    }

    public String getType() {
        return type;
    }

    public Product setType(final String type) {
        this.type = type;
        return this;
    }

    public String getVendor() {
        return vendor;
    }

    public Product setVendor(final String vendor) {
        this.vendor = vendor;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Product setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public List<ProductVariant> getVariants() {
        return variants;
    }

    public Product setVariants(final List<ProductVariant> variants) {
        this.variants = variants;
        return this;
    }

    public List<ProductImage> getImages() {
        return images;
    }

    public Product setImages(final List<ProductImage> images) {
        this.images = images;
        return this;
    }

    public String getPublishedAtForeign() {
        return publishedAtForeign;
    }

    public Product setPublishedAtForeign(final String publishedAtForeign) {
        this.publishedAtForeign = publishedAtForeign;
        return this;
    }
}
