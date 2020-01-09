package com.mailchimp.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Micheal Swiggs
 */
@Data
public class ListMergeFields {

    @JsonProperty("total_items")
    private Integer totalItems;

    @JsonProperty("merge_fields")
    private List<ListMergeField> mergeFields;

    @JsonProperty("list_id")
    private String listId;
}
