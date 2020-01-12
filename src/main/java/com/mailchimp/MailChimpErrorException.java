package com.mailchimp;

import com.mailchimp.domain.MailChimpError;

import feign.FeignException;

/**
 *
 * @author stevensnoeijen
 */
public class MailChimpErrorException extends FeignException {

    private MailChimpError error;
    private int status;

    /**
     * Creates a new instance of <code>MailChimpErrorException</code> without detail message.
     */
    public MailChimpErrorException(int status, String message, MailChimpError error) {
        super(message);
        this.status = status;
        this.error = error;
    }

    @Override
    public String toString() {
        return error.toString();
    }

    public int getStatus() {
        return status;
    }

    public MailChimpError getError() {
        return error;
    }
}
