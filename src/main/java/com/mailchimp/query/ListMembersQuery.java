package com.mailchimp.query;

import com.mailchimp.domain.SubscribeStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ListMembersQuery {

    @Getter
    private Integer offset;

    @Getter
    private Integer count;

    @Getter
    private SubscribeStatus status;

    /**
     * Returns an empty instance.
     * @return ListMembersQuery
     */
    public static ListMembersQuery all() {
        return new ListMembersQuery();
    }

    /**
     * Returns an empty instance, which acts like the first page
     * @return ListMembersQuery
     */
    public static ListMembersQuery firstPage() {
        return new ListMembersQuery();
    }
}
