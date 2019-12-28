package com.mailchimp.query;

public class StoresQuery {

    private Integer offset;
    private Integer count;

    public StoresQuery() {
    }

    public StoresQuery(final Integer offset, final Integer count) {
        this.offset = offset;
        this.count = count;
    }

    public Integer getOffset() {
        return offset;
    }

    public Integer getCount() {
        return count;
    }

    public static StoresQuery firstPage() {
        return new StoresQuery();
    }
}