package com.mailchimp.domain.promo;

import java.util.Objects;

public class PromoRuleCreate {

    private String id;
    private String title;
    private String description;
    private String startsAt;
    private String endsAt;
    private Float amount;
    private Type type;
    private Target target;
    private Boolean enabled;
    private String createdAtForeign;
    private String updatedAtForeign;

    public PromoRuleCreate(final Builder builder) {
        id = builder.id;
        title = builder.title;
        description = builder.description;
        startsAt = builder.startsAt;
        endsAt = builder.endsAt;
        amount = builder.amount;
        type = builder.type;
        target = builder.target;
        enabled = builder.enabled;
        createdAtForeign = builder.createdAtForeign;
        updatedAtForeign = builder.updatedAtForeign;
    }

    public enum Target {
        per_item, total, shipping
    }

    public enum Type {
        fixed, percentage
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStartsAt() {
        return startsAt;
    }

    public String getEndsAt() {
        return endsAt;
    }

    public float getAmount() {
        return amount;
    }

    public Type getType() {
        return type;
    }

    public Target getTarget() {
        return target;
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
        private String title;
        private String description;
        private String startsAt;
        private String endsAt;
        private Float amount;
        private Type type;
        private Target target;
        private Boolean enabled;
        private String createdAtForeign;
        private String updatedAtForeign;

        public Builder setId(final String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(final String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(final String description) {
            this.description = description;
            return this;
        }

        public Builder setStartsAt(final String startsAt) {
            this.startsAt = startsAt;
            return this;
        }

        public Builder setEndsAt(final String endsAt) {
            this.endsAt = endsAt;
            return this;
        }

        public Builder setAmount(final float amount) {
            this.amount = amount;
            return this;
        }

        public Builder setType(final Type type) {
            this.type = type;
            return this;
        }

        public Builder setTarget(final Target target) {
            this.target = target;
            return this;
        }

        public Builder setEnabled(final Boolean enabled) {
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
         * Builds the instance
         * @return PromoRuleCreate
         */
        public PromoRuleCreate build() {
            if (Objects.isNull(this.id) || Objects.isNull(this.type) || Objects.isNull(this.description)
                    || Objects.isNull(this.target) || Objects.isNull(this.amount)) {
                throw new IllegalStateException("The required parameters are id, description, type, target, amount.");
            }
            if (this.type.equals(Type.percentage) && (this.amount > 1.0 || this.amount < 0.0)) {
                throw new IllegalStateException("If the type is percentage then the amount should be between"
                        + " 0.0 and 1.0 inclusive");
            }
            return new PromoRuleCreate(this);
        }
    }

}
