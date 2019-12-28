package com.mailchimp.integration;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;

import com.mailchimp.domain.store.Store;
import com.mailchimp.domain.store.StoreCreate;
import com.mailchimp.domain.store.Stores;
import com.mailchimp.query.StoresQuery;

public class StoreTest extends AbstractIntegrationTest {

    @Test
    public void testReadAllShouldMapTowardsMailChimp() throws IOException {
        // GIVEN
        expectGet("/3.0/ecommerce/stores/", "store/list.json");
        // WHEN
        Stores stores = mailChimpClient.getStores(StoresQuery.firstPage());
        // THEN
        assertNotNull(stores);
    }

    @Test
    public void testPaginationShouldMapTowardsMailChimp() throws IOException {
        // GIVEN
        expectGet("/3.0/ecommerce/stores/?offset=20&count=20", "store/list.json");
        // WHEN
        Stores stores = mailChimpClient.getStores(new StoresQuery(20, 20));
        // THEN
        assertNotNull(stores);
    }

    @Test
    public void testDeleteShouldMapTowardsMailChimp() {
        // GIVEN
        expectDelete("/3.0/ecommerce/stores/store_id");
        // WHEN
        mailChimpClient.removeStore("store_id");
        // THEN no exception occurs
    }

    @Test
    public void testCreateShouldMapTowardsMailChimp() throws IOException {
        // GIVEN
        expectPost("/3.0/ecommerce/stores", "store/create.json", "/store/create.json");
        StoreCreate storeToCreate = StoreCreate.builder()
                .setId("store_id")
                .setCurrencyCode("HUF")
                .setListId("list_id")
                .setName("store_name").build();
        // WHEN
        Store store = mailChimpClient.create(storeToCreate);
        // THEN
        assertNotNull(store);
    }

}
