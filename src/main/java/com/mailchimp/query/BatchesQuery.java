package com.mailchimp.query;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BatchesQuery {
    @Getter
    private Integer offset;

    @Getter
    private Integer count;

    /**
     * Returns an empty instance, which acts like the first page.
     * @return BatchesQuery
     */
    public static BatchesQuery firstPage() {
        return new BatchesQuery();
    }
}
