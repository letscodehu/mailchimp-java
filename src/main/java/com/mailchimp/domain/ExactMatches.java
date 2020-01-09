package com.mailchimp.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Keisuke Kato
 */
@Data
public class ExactMatches {

    @JsonProperty("members")
    private List<Member> members;

    @JsonProperty("total_items")
    private Integer totalItems;

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }
}
