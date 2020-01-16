package com.mailchimp.domain.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderLine {

    private String id;
    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("product_variant_id")
    private String productVariantId;
    private int quantity;
    private int price;
    private int discount;

    public String getId() {
        return id;
    }

    public OrderLine setId(final String id) {
        this.id = id;
        return this;
    }

    public String getProductId() {
        return productId;
    }

    public OrderLine setProductId(final String productId) {
        this.productId = productId;
        return this;
    }

    public String getProductVariantId() {
        return productVariantId;
    }

    public OrderLine setProductVariantId(final String productVariantId) {
        this.productVariantId = productVariantId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderLine setQuantity(final int quantity) {
        this.quantity = quantity;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public OrderLine setPrice(final int price) {
        this.price = price;
        return this;
    }

    public int getDiscount() {
        return discount;
    }

    public OrderLine setDiscount(final int discount) {
        this.discount = discount;
        return this;
    }
}
