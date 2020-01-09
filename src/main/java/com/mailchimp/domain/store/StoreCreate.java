package com.mailchimp.domain.store;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mailchimp.domain.Address;

public class StoreCreate {

    private String id;
    @JsonProperty("list_id")
    private String listId;
    private String name;
    private String platform;
    private String domain;
    @JsonProperty("is_syncing")
    private boolean syncing;
    @JsonProperty("email_address")
    private String emailAddress;
    @JsonProperty("currency_code")
    private String currencyCode;
    @JsonProperty("money_format")
    private String moneyFormat;
    @JsonProperty("primary_locale")
    private String primaryLocale;
    private String timezone;
    private String phone;
    private Address address;

    StoreCreate(final Builder builder) {
        this.id = builder.id;
        this.listId = builder.listId;
        this.name = builder.name;
        this.platform = builder.platform;
        this.domain = builder.domain;
        this.syncing = builder.syncing;
        this.emailAddress = builder.emailAddress;
        this.currencyCode = builder.currencyCode;
        this.moneyFormat = builder.moneyFormat;
        this.primaryLocale = builder.primaryLocale;
        this.timezone = builder.timezone;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public String getListId() {
        return listId;
    }

    public String getName() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    public String getDomain() {
        return domain;
    }

    public boolean isSyncing() {
        return syncing;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getMoneyFormat() {
        return moneyFormat;
    }

    public String getPrimaryLocale() {
        return primaryLocale;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    public static class Builder {

        private String id;
        @JsonProperty("list_id")
        private String listId;
        private String name;
        private String platform;
        private String domain;
        @JsonProperty("is_syncing")
        private boolean syncing;
        @JsonProperty("email_address")
        private String emailAddress;
        @JsonProperty("currency_code")
        private String currencyCode;
        @JsonProperty("money_format")
        private String moneyFormat;
        @JsonProperty("primary_locale")
        private String primaryLocale;
        private String timezone;
        private String phone;
        private Address address;

        public Builder setId(final String id) {
            this.id = id;
            return this;
        }

        public Builder setListId(final String listId) {
            this.listId = listId;
            return this;
        }

        public Builder setName(final String name) {
            this.name = name;
            return this;
        }

        public Builder setPlatform(final String platform) {
            this.platform = platform;
            return this;
        }

        public Builder setDomain(final String domain) {
            this.domain = domain;
            return this;
        }

        public Builder setSyncing(final boolean syncing) {
            this.syncing = syncing;
            return this;
        }

        public Builder setEmailAddress(final String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setCurrencyCode(final String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Builder setMoneyFormat(final String moneyFormat) {
            this.moneyFormat = moneyFormat;
            return this;
        }

        public Builder setPrimaryLocale(final String primaryLocale) {
            this.primaryLocale = primaryLocale;
            return this;
        }

        public Builder setTimezone(final String timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setPhone(final String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(final Address address) {
            this.address = address;
            return this;
        }

        public StoreCreate build() {
            if (Objects.isNull(this.id) || Objects.isNull(this.name) || Objects.isNull(this.currencyCode) || Objects
                    .isNull(this.listId)) {
                throw new IllegalStateException("Required fields are id, list_id, currency_code and name.");
            }
            return new StoreCreate(this);
        }

    }

}
