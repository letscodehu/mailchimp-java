package com.mailchimp.integration;

import static org.junit.Assert.assertNotNull;

import java.util.Collections;

import org.junit.Test;

import com.mailchimp.domain.customer.Customer;
import com.mailchimp.domain.order.Order;
import com.mailchimp.domain.order.OrderCreate;
import com.mailchimp.domain.order.OrderLine;
import com.mailchimp.domain.order.Orders;
import com.mailchimp.query.OrdersQuery;

public class OrderTest extends AbstractIntegrationTest {

    @Test
    public void testCreateShouldMapTowardsMailChimp() {
        // GIVEN
        Customer customer = new Customer();
        customer.setId("fejlesztes@letscode.hu");
        customer.setEmailAddress("fejlesztes@letscode.hu");
        OrderLine orderLine = new OrderLine();
        orderLine.setId("order_line_id");
        orderLine.setPrice(2500);
        orderLine.setDiscount(0);
        orderLine.setProductId("product_id");
        orderLine.setProductVariantId("product_variant_id");
        OrderCreate build = OrderCreate.builder()
                .setCurrencyCode("HUF")
                .setId("order_id")
                .setCustomer(customer)
                .setLines(Collections.singletonList(orderLine)).build();
        // WHEN
        Order created = mailChimpClient.createOrder("arandomid", build);
        // THEN
        assertNotNull(created);
    }

    @Test
    public void testListShouldMapTowardsMailChimp() {
        // GIVEN
        // WHEN
        Orders orders = mailChimpClient.retrieveOrders("arandomid", OrdersQuery.firstPage());
        // THEN
        assertNotNull(orders);
    }

}
