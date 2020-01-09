package com.mailchimp.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author eamoralesl
 */
@Data
public class Segments {
    @JsonProperty("list_id")
    private String listId;
    @JsonProperty("segments")
    private List<Segment> segments = null;
    @JsonProperty("total_items")
    private Integer totalItems;

}
