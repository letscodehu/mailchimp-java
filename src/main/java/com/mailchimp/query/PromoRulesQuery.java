package com.mailchimp.query;

public class PromoRulesQuery {

    private Integer offset;
    private Integer count;

    public PromoRulesQuery() {
    }

    public PromoRulesQuery(final Integer offset, final Integer count) {
        this.offset = offset;
        this.count = count;
    }

    /**
     * Returns an empty instance, which acts like the first page.
     * @return PromoRulesQuery
     */
    public static PromoRulesQuery firstPage() {
        return new PromoRulesQuery();
    }

    public Integer getOffset() {
        return offset;
    }

    public Integer getCount() {
        return count;
    }
}
