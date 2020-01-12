package com.mailchimp.integration;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;

import com.mailchimp.MailChimpClient;
import com.mailchimp.MailChimpClientBuilder;
import com.mailchimp.domain.promo.PromoCode;
import com.mailchimp.domain.promo.PromoCodeCreate;
import com.mailchimp.domain.promo.PromoCodes;

public class PromoCodeTest extends AbstractIntegrationTest {

    @Test
    public void testCreateShouldMapTowardsMailChimp() throws IOException {
        // GIVEN
        PromoCodeCreate promoCode = PromoCodeCreate.builder()
                .setCode("LETS-4234234-CODE")
                .setId("promo_code_id")
                .setRedemptionUrl("https://example.com").build();
        expectPost("/3.0/ecommerce/stores/store_id/promo-rules/promo_rule_id/promo-codes",
                "promo-rules/promo-codes/create.json", "promo-rules/promo-codes/create.json");
        // WHEN
        PromoCode created = mailChimpClient.createPromoCode("store_id", "promo_rule_id", promoCode);
        // THEN
        assertNotNull(created);
    }

    @Test
    public void testReadAllShouldMapTowardsMailChimp() throws IOException {
        // GIVEN
        expectGet("/3.0/ecommerce/stores/store_id/promo-rules/promo_rule_id/promo-codes",
                "promo-rules/promo-codes/list.json");
        // WHEN
        PromoCodes promoCodes = mailChimpClient.getPromoCodes("store_id", "promo_rule_id");
        // THEN
        assertNotNull(promoCodes);
    }

    @Test
    public void testReadPromoCodeShouldMapTowardsMailChimp() throws IOException {
        // GIVEN
        expectGet("/3.0/ecommerce/stores/store_id/promo-rules/promo_rule_id/promo-codes/promo_code_id",
                "promo-rules/promo-codes/single.json");
        // WHEN
        PromoCode promoCode = mailChimpClient.getPromoCode("store_id", "promo_rule_id", "promo_code_id");
        // THEN
        assertNotNull(promoCode);
    }

    @Test
    public void testUpdatePromoCodeShouldMapTowardsMailChimp() throws IOException {
        // GIVEN
        expectPatch("/3.0/ecommerce/stores/store_id/promo-rules/promo_rule_id/promo-codes/promo_code_id",
                "promo-rules/promo-codes/update.json", "promo-rules/promo-codes/update.json");
        // WHEN
        PromoCode code = new PromoCode();
        code.setUsageCount(50);
        PromoCode updated = mailChimpClient.updatePromoCode("store_id", "promo_rule_id", "promo_code_id", code);
        // THEN
        assertNotNull(updated);
    }

    @Test
    public void testDeleteShouldMapTowardsMailChimp() {
        // GIVEN
        expectDelete("/3.0/ecommerce/stores/store_id/promo-rules/promo_rule_id");
        // WHEN
        mailChimpClient.deletePromoRule("store_id", "promo_rule_id");
        // THEN
    }

}
