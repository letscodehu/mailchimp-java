package com.mailchimp.domain.product;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductCreate {

    private final String id;
    private final String title;
    private final String handle;
    private final String url;
    private final String description;
    private final String type;
    private final String vendor;
    @JsonProperty("image_url")
    private final String imageUrl;
    private final List<ProductVariant> variants;
    private final List<ProductImage> images;
    @JsonProperty("published_at_foreign")
    private final String publishedAtForeign;

    private ProductCreate(final Builder builder) {
        id = builder.id;
        title = builder.title;
        handle = builder.handle;
        url = builder.url;
        description = builder.description;
        type = builder.type;
        vendor = builder.vendor;
        imageUrl = builder.imageUrl;
        variants = builder.variants;
        images = builder.images;
        publishedAtForeign = builder.publishedAtForeign;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getHandle() {
        return handle;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getVendor() {
        return vendor;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public List<ProductVariant> getVariants() {
        return variants;
    }

    public List<ProductImage> getImages() {
        return images;
    }

    public String getPublishedAtForeign() {
        return publishedAtForeign;
    }

    public static class Builder {

        private String id;
        private String title;
        private String handle;
        private String url;
        private String description;
        private String type;
        private String vendor;
        private String imageUrl;
        private List<ProductVariant> variants;
        private List<ProductImage> images;
        private String publishedAtForeign;

        public Builder setId(final String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(final String title) {
            this.title = title;
            return this;
        }

        public Builder setHandle(final String handle) {
            this.handle = handle;
            return this;
        }

        public Builder setUrl(final String url) {
            this.url = url;
            return this;
        }

        public Builder setDescription(final String description) {
            this.description = description;
            return this;
        }

        public Builder setType(final String type) {
            this.type = type;
            return this;
        }

        public Builder setVendor(final String vendor) {
            this.vendor = vendor;
            return this;
        }

        public Builder setImageUrl(final String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder setVariants(final List<ProductVariant> variants) {
            this.variants = variants;
            return this;
        }

        public Builder setImages(final List<ProductImage> images) {
            this.images = images;
            return this;
        }

        public Builder setPublishedAtForeign(final String publishedAtForeign) {
            this.publishedAtForeign = publishedAtForeign;
            return this;
        }

        public ProductCreate build() {
            if (Objects.isNull(this.id) || Objects.isNull(this.title) || Objects.isNull(this.variants)
                    || this.variants.isEmpty()) {
                throw new IllegalStateException("The required parameters are id,title, variants.");
            }
            return new ProductCreate(this);
        }

    }

}
