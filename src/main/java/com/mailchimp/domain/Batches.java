package com.mailchimp.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 *
 * @author stevensnoeijen
 */
@Data
public class Batches {

    @JsonProperty("batches")
    private List<Batch> batches;

    @JsonProperty("total_items")
    private Integer totalItems;

}
