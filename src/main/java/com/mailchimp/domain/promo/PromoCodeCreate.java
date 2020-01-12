package com.mailchimp.domain.promo;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PromoCodeCreate {

    private final String id;
    private final String code;
    @JsonProperty("redemption_url")
    private final String redemptionUrl;
    @JsonProperty("usage_count")
    private final Integer usageCount;
    private final Boolean enabled;
    @JsonProperty("created_at_foreign")
    private final String createdAtForeign;
    @JsonProperty("updated_at_foreign")
    private final String updatedAtForeign;

    public PromoCodeCreate(Builder builder) {
        id = builder.id;
        code = builder.code;
        redemptionUrl = builder.redemptionUrl;
        usageCount = builder.usageCount;
        enabled = builder.enabled;
        createdAtForeign = builder.createdAtForeign;
        updatedAtForeign = builder.updatedAtForeign;
    }

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

    /**
     * Returns a new builder instance.
     * @return Builder
     */
    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String id;
        private String code;
        private String redemptionUrl;
        private Integer usageCount;
        private Boolean enabled;
        private String createdAtForeign;
        private String updatedAtForeign;

        public Builder setId(final String id) {
            this.id = id;
            return this;
        }

        public Builder setCode(final String code) {
            this.code = code;
            return this;
        }

        public Builder setRedemptionUrl(final String redemptionUrl) {
            this.redemptionUrl = redemptionUrl;
            return this;
        }

        public Builder setUsageCount(final int usageCount) {
            this.usageCount = usageCount;
            return this;
        }

        public Builder setEnabled(final boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setCreatedAtForeign(final String createdAtForeign) {
            this.createdAtForeign = createdAtForeign;
            return this;
        }

        public Builder setUpdatedAtForeign(final String updatedAtForeign) {
            this.updatedAtForeign = updatedAtForeign;
            return this;
        }

        /**
         * Builds the object.
         * @return PromoCodeCreate
         */
        public PromoCodeCreate build() {
            if (Objects.isNull(this.id) || Objects.isNull(this.code) || Objects.isNull(redemptionUrl)) {
                throw new IllegalStateException("The required parameters are id, code, redemption_url.");
            }
            return new PromoCodeCreate(this);
        }

    }

}
