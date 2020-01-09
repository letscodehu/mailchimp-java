package com.mailchimp.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CreateBatch<T> {

    @JsonProperty
    private List<Operation<T>> operations;
}
