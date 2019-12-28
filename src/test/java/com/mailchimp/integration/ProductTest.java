package com.mailchimp.integration;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.Collections;

import org.junit.Test;

import com.mailchimp.domain.product.Product;
import com.mailchimp.domain.product.ProductCreate;
import com.mailchimp.domain.product.ProductVariant;

public class ProductTest extends AbstractIntegrationTest {

    @Test
    public void testCreateShouldMapTowardsMailChimp() throws IOException {
        // GIVEN
        ProductVariant productVariant = new ProductVariant();
        productVariant.setId("product_variant_id");
        productVariant.setTitle("product_variant_title");
        productVariant.setPrice(2990);
        ProductCreate product = ProductCreate.builder()
                .setId("product_id")
                .setTitle("product_title")
                .setVariants(Collections.singletonList(productVariant)).build();
        expectPost("/3.0/ecommerce/stores/store_id/products", "product/create.json", "product/create.json");
        // WHEN
        Product created = mailChimpClient.create("store_id", product);
        // THEN
        assertNotNull(created);
    }

}
