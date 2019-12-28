package com.mailchimp.integration;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;

import com.mailchimp.domain.customer.Customer;
import com.mailchimp.domain.customer.CustomerCreate;
import com.mailchimp.domain.customer.Customers;

public class CustomerTest extends AbstractIntegrationTest {

    @Test
    public void testCreateShouldMapTowardsMailChimp() throws IOException {
        // GIVEN
        CustomerCreate customer = CustomerCreate.builder()
                .setId("customer_id")
                .setEmailAddress("email@email.com")
                .setOptInStatus(false).build();
        expectPost("/3.0/ecommerce/stores/store_id/customers", "customer/create.json", "customer/create.json");
        // WHEN
        Customer created = mailChimpClient.create("store_id", customer);
        // THEN
        assertNotNull(created);
    }

    @Test
    public void testListShouldMapTowardsMailChimp() throws IOException {
        // GIVEN
        expectGet("/3.0/ecommerce/stores/store_id/customers", "customer/list.json");
        // WHEN
        Customers customers = mailChimpClient.getCustomers("store_id");
        // THEN
        assertNotNull(customers);
    }

}
