package com.mailchimp.query;

public class OrdersQuery {

    private Integer offset;
    private Integer count;

    public OrdersQuery() {
    }

    public OrdersQuery(final Integer offset, final Integer count) {
        this.offset = offset;
        this.count = count;
    }

    /**
     * Returns an empty instance, which acts like the first page.
     * @return OrdersQuery
     */
    public static OrdersQuery firstPage() {
        return new OrdersQuery();
    }

    public Integer getOffset() {
        return offset;
    }

    public Integer getCount() {
        return count;
    }
}
