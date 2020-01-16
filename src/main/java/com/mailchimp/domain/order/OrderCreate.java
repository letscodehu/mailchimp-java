package com.mailchimp.domain.order;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mailchimp.domain.Address;
import com.mailchimp.domain.Link;
import com.mailchimp.domain.customer.Customer;
import com.mailchimp.domain.promo.PromoCodeCreate;

public class OrderCreate {

    private final String id;
    private final Customer customer;
    @JsonProperty("campaign_id")
    private final String campaignId;
    @JsonProperty("landing_site")
    private final String landingSite;
    @JsonProperty("financial_status")
    private final String financialStatus;
    @JsonProperty("fulfillment_status")
    private final String fulfillmentStatus;
    @JsonProperty("currency_code")
    private final String currencyCode;
    @JsonProperty("order_total")
    private final int orderTotal;
    @JsonProperty("order_url")
    private final String orderUrl;
    @JsonProperty("discount_total")
    private final int discountTotal;
    @JsonProperty("tax_total")
    private final int taxTotal;
    @JsonProperty("shipping_total")
    private final int shippingTotal;
    @JsonProperty("tracking_code")
    private final String trackingCode;
    @JsonProperty("processed_at_foreign")
    private final String processedAtForeign;
    @JsonProperty("cancelled_at_foreign")
    private final String cancelledAtForeign;
    @JsonProperty("updated_at_foreign")
    private final String updatedAtForeign;
    @JsonProperty("shipping_address")
    private final Address shippingAddress;
    @JsonProperty("billing_address")
    private final Address billingAddress;
    private final List<PromoCodeCreate> promos;
    private final List<OrderLine> lines;
    @JsonProperty("_links")
    private final List<Link> links;

    private OrderCreate(Builder builder) {
        id = builder.id;
        customer = builder.customer;
        campaignId = builder.campaignId;
        landingSite = builder.landingSite;
        financialStatus = builder.financialStatus;
        fulfillmentStatus = builder.fulfillmentStatus;
        currencyCode = builder.currencyCode;
        orderTotal = builder.orderTotal;
        orderUrl = builder.orderUrl;
        discountTotal = builder.discountTotal;
        taxTotal = builder.taxTotal;
        shippingTotal = builder.shippingTotal;
        trackingCode = builder.trackingCode;
        processedAtForeign = builder.processedAtForeign;
        cancelledAtForeign = builder.cancelledAtForeign;
        updatedAtForeign = builder.updatedAtForeign;
        shippingAddress = builder.shippingAddress;
        billingAddress = builder.billingAddress;
        promos = builder.promos;
        lines = builder.lines;
        links = builder.links;
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public String getLandingSite() {
        return landingSite;
    }

    public String getFinancialStatus() {
        return financialStatus;
    }

    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public int getOrderTotal() {
        return orderTotal;
    }

    public String getOrderUrl() {
        return orderUrl;
    }

    public int getDiscountTotal() {
        return discountTotal;
    }

    public int getTaxTotal() {
        return taxTotal;
    }

    public int getShippingTotal() {
        return shippingTotal;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public String getProcessedAtForeign() {
        return processedAtForeign;
    }

    public String getCancelledAtForeign() {
        return cancelledAtForeign;
    }

    public String getUpdatedAtForeign() {
        return updatedAtForeign;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public List<PromoCodeCreate> getPromos() {
        return promos;
    }

    public List<OrderLine> getLines() {
        return lines;
    }

    public List<Link> getLinks() {
        return links;
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
        private Customer customer;
        private String campaignId;
        private String landingSite;
        private String financialStatus;
        private String fulfillmentStatus;
        private String currencyCode;
        private int orderTotal;
        private String orderUrl;
        private int discountTotal;
        private int taxTotal;
        private int shippingTotal;
        private String trackingCode;
        private String processedAtForeign;
        private String cancelledAtForeign;
        private String updatedAtForeign;
        private Address shippingAddress;
        private Address billingAddress;
        private List<PromoCodeCreate> promos;
        private List<OrderLine> lines;
        private List<Link> links;

        public Builder setId(final String id) {
            this.id = id;
            return this;
        }

        public Builder setCustomer(final Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder setCampaignId(final String campaignId) {
            this.campaignId = campaignId;
            return this;
        }

        public Builder setLandingSite(final String landingSite) {
            this.landingSite = landingSite;
            return this;
        }

        public Builder setFinancialStatus(final String financialStatus) {
            this.financialStatus = financialStatus;
            return this;
        }

        public Builder setFulfillmentStatus(final String fulfillmentStatus) {
            this.fulfillmentStatus = fulfillmentStatus;
            return this;
        }

        public Builder setCurrencyCode(final String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Builder setOrderTotal(final int orderTotal) {
            this.orderTotal = orderTotal;
            return this;
        }

        public Builder setOrderUrl(final String orderUrl) {
            this.orderUrl = orderUrl;
            return this;
        }

        public Builder setDiscountTotal(final int discountTotal) {
            this.discountTotal = discountTotal;
            return this;
        }

        public Builder setTaxTotal(final int taxTotal) {
            this.taxTotal = taxTotal;
            return this;
        }

        public Builder setShippingTotal(final int shippingTotal) {
            this.shippingTotal = shippingTotal;
            return this;
        }

        public Builder setTrackingCode(final String trackingCode) {
            this.trackingCode = trackingCode;
            return this;
        }

        public Builder setProcessedAtForeign(final String processedAtForeign) {
            this.processedAtForeign = processedAtForeign;
            return this;
        }

        public Builder setCancelledAtForeign(final String cancelledAtForeign) {
            this.cancelledAtForeign = cancelledAtForeign;
            return this;
        }

        public Builder setUpdatedAtForeign(final String updatedAtForeign) {
            this.updatedAtForeign = updatedAtForeign;
            return this;
        }

        public Builder setShippingAddress(final Address shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder setBillingAddress(final Address billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        public Builder setPromos(final List<PromoCodeCreate> promos) {
            this.promos = promos;
            return this;
        }

        public Builder setLines(final List<OrderLine> lines) {
            this.lines = lines;
            return this;
        }

        public Builder setLinks(final List<Link> links) {
            this.links = links;
            return this;
        }

        /**
         * Builds the object.
         * @return OrderCreate
         */
        public OrderCreate build() {
            if (Objects.isNull(this.id) || Objects.isNull(this.customer) || Objects.isNull(currencyCode)
                    || Objects.isNull(this.lines)) {
                throw new IllegalStateException("Required fields are id, customer, currency_code, lines");
            }
            return new OrderCreate(this);
        }

    }

}
