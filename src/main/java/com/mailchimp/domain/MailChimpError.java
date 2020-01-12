package com.mailchimp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.ToString;

/**
 *
 * @author stevensnoeijen
 */
@ToString
public class MailChimpError {

    @JsonProperty
    @Getter
    private String type;
    @JsonProperty
    @Getter
    private String title;
    @JsonProperty
    @Getter
    private Integer status;
    @JsonProperty
    @Getter
    private String detail;
    @JsonProperty
    @Getter
    private String instance;
    @JsonProperty
    @Getter
    private java.util.List<BodyError> errors;

    @ToString
    public static class BodyError {

        @JsonProperty
        @Getter
        private String field;

        @JsonProperty
        @Getter
        private String message;
    }
}
