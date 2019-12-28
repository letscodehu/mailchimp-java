package com.mailchimp.domain.cart;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mailchimp.domain.customer.Customer;

public class CartCreate {

    private String id;
    private Customer customer;
    @JsonProperty("order_total")
    private long orderTotal;
    @JsonProperty("checkout_url")
    private String checkoutUrl;
    @JsonProperty("campaign_id")
    private String campaignId;
    @JsonProperty("currency_code")
    private String currencyCode;
    @JsonProperty("tax_total")
    private long taxTotal;
    private List<CartLine> lines;

    private CartCreate(final Builder builder) {
        this.id = builder.id;
        this.customer = builder.customer;
        this.orderTotal = builder.orderTotal;
        this.checkoutUrl = builder.checkoutUrl;
        this.campaignId = builder.campaignId;
        this.currencyCode = builder.currencyCode;
        this.taxTotal = builder.taxTotal;
        this.lines = builder.lines;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public long getOrderTotal() {
        return orderTotal;
    }

    public String getCheckoutUrl() {
        return checkoutUrl;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public long getTaxTotal() {
        return taxTotal;
    }

    public List<CartLine> getLines() {
        return lines;
    }

    public static final class Builder {

        private String id;
        private Customer customer;
        private long orderTotal;
        private String checkoutUrl;
        private String campaignId;
        private String currencyCode;
        private long taxTotal;
        private List<CartLine> lines;

        public Builder setId(final String id) {
            this.id = id;
            return this;
        }

        public Builder setCustomer(final Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder setOrderTotal(final long orderTotal) {
            this.orderTotal = orderTotal;
            return this;
        }

        public Builder setCheckoutUrl(final String checkoutUrl) {
            this.checkoutUrl = checkoutUrl;
            return this;
        }

        public Builder setCampaignId(final String campaignId) {
            this.campaignId = campaignId;
            return this;
        }

        public Builder setCurrencyCode(final String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Builder setTaxTotal(final long taxTotal) {
            this.taxTotal = taxTotal;
            return this;
        }

        public Builder setLines(final List<CartLine> lines) {
            this.lines = lines;
            return this;
        }

        public CartCreate build() {
            if (Objects.isNull(this.id) || Objects.isNull(this.customer) || Objects.isNull(this.currencyCode) || Objects
                    .isNull(lines)) {
                throw new IllegalStateException(
                        "The required fields are id, customer, currency_code, order_total, lines.");
            }
            return new CartCreate(this);
        }

    }

}
