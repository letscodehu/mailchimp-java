package com.mailchimp.domain.order;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mailchimp.domain.Address;
import com.mailchimp.domain.Link;
import com.mailchimp.domain.customer.Customer;
import com.mailchimp.domain.promo.PromoCodeCreate;

public class Order {

    private String id;
    private Customer customer;
    @JsonProperty("campaign_id")
    private String campaignId;
    @JsonProperty("landing_site")
    private String landingSite;
    @JsonProperty("financial_status")
    private String financialStatus;
    @JsonProperty("fulfillment_status")
    private String fulfillmentStatus;
    @JsonProperty("currency_code")
    private String currencyCode;
    @JsonProperty("order_total")
    private int orderTotal;
    @JsonProperty("order_url")
    private String orderUrl;
    @JsonProperty("discount_total")
    private int discountTotal;
    @JsonProperty("tax_total")
    private int taxTotal;
    @JsonProperty("shipping_total")
    private int shippingTotal;
    @JsonProperty("tracking_code")
    private String trackingCode;
    @JsonProperty("processed_at_foreign")
    private String processedAtForeign;
    @JsonProperty("cancelled_at_foreign")
    private String cancelledAtForeign;
    @JsonProperty("updated_at_foreign")
    private String updatedAtForeign;
    @JsonProperty("shipping_address")
    private Address shippingAddress;
    @JsonProperty("billing_address")
    private Address billingAddress;
    private List<PromoCodeCreate> promos;
    private List<OrderLine> lines;
    @JsonProperty("_links")
    private List<Link> links;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(final String campaignId) {
        this.campaignId = campaignId;
    }

    public String getLandingSite() {
        return landingSite;
    }

    public void setLandingSite(final String landingSite) {
        this.landingSite = landingSite;
    }

    public String getFinancialStatus() {
        return financialStatus;
    }

    public void setFinancialStatus(final String financialStatus) {
        this.financialStatus = financialStatus;
    }

    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    public void setFulfillmentStatus(final String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(final int orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getOrderUrl() {
        return orderUrl;
    }

    public void setOrderUrl(final String orderUrl) {
        this.orderUrl = orderUrl;
    }

    public int getDiscountTotal() {
        return discountTotal;
    }

    public void setDiscountTotal(final int discountTotal) {
        this.discountTotal = discountTotal;
    }

    public int getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(final int taxTotal) {
        this.taxTotal = taxTotal;
    }

    public int getShippingTotal() {
        return shippingTotal;
    }

    public void setShippingTotal(final int shippingTotal) {
        this.shippingTotal = shippingTotal;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(final String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public String getProcessedAtForeign() {
        return processedAtForeign;
    }

    public void setProcessedAtForeign(final String processedAtForeign) {
        this.processedAtForeign = processedAtForeign;
    }

    public String getCancelledAtForeign() {
        return cancelledAtForeign;
    }

    public void setCancelledAtForeign(final String cancelledAtForeign) {
        this.cancelledAtForeign = cancelledAtForeign;
    }

    public String getUpdatedAtForeign() {
        return updatedAtForeign;
    }

    public void setUpdatedAtForeign(final String updatedAtForeign) {
        this.updatedAtForeign = updatedAtForeign;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(final Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(final Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public List<PromoCodeCreate> getPromos() {
        return promos;
    }

    public void setPromos(final List<PromoCodeCreate> promos) {
        this.promos = promos;
    }

    public List<OrderLine> getLines() {
        return lines;
    }

    public void setLines(final List<OrderLine> lines) {
        this.lines = lines;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(final List<Link> links) {
        this.links = links;
    }
}
