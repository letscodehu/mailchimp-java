package com.mailchimp.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Keisuke Kato
 */
@Data
public class FullSearch {

    @JsonProperty("members")
    private List<Member> members;

    @JsonProperty("total_items")
    private Integer totalItems;
}
