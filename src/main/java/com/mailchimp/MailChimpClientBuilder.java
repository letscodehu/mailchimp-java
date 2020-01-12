package com.mailchimp;

import java.util.Objects;

import com.mailchimp.auth.OAuth2RequestInterceptor;
import com.mailchimp.jackson.JacksonDecoder;
import com.mailchimp.jackson.JacksonEncoder;

import feign.Client;
import feign.Feign;
import feign.Logger;
import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;

/**
 * Builder for creating the {@link MailChimpClient}
 */
public class MailChimpClientBuilder {

    //feign specific options
    private Client client = new Client.Default(null, null);
    private Logger.Level logLevel = Logger.Level.NONE;
    private Logger logger = new Logger.NoOpLogger();

    //mailchimp specific options
    private RequestInterceptor authRequestInterceptor;
    private String apiBase;

    /**
     * Changes the default client.
     * @param client the client
     * @return self
     */
    public MailChimpClientBuilder withClient(Client client) {
        this.client = client;
        return this;
    }

    /**
     * Changes the logger implementation. No-op logger is the default.
     * @param logger the logger
     * @return self
     */
    public MailChimpClientBuilder withLogger(Logger logger) {
        this.logger = logger;
        return this;
    }

    /**
     * Changes the loglevel
     * @param logLevel the loglevel
     * @return self
     */
    public MailChimpClientBuilder withLogLevel(Logger.Level logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * Sets the authentication type to basic with the given api key as password.
     * @param apiKey the api key to use
     * @return self
     */
    public MailChimpClientBuilder withBasicAuthentication(String apiKey) {
        this.authRequestInterceptor = new BasicAuthRequestInterceptor("anyString", apiKey);
        return this;
    }

    /**
     * Changes authentication to OAuth2 with the given access token.
     * @param accessToken the access token to use
     * @return self
     */
    public MailChimpClientBuilder withOAuth2Authentication(String accessToken) {
        this.authRequestInterceptor = new OAuth2RequestInterceptor(accessToken);
        return this;
    }

    /**
     * Changes the API base for mailchimp.
     * @param apiBase the api base
     * @return self
     */
    public MailChimpClientBuilder withApiBase(String apiBase) {
        this.apiBase = apiBase;
        return this;
    }

    /**
     * Builds a new client with feign proxy.
     * @return MailChimpClient
     */
    public MailChimpClient build() {
        Objects.requireNonNull(apiBase, "apiBase is required");
        Objects.requireNonNull(authRequestInterceptor, "authRequestInterceptor is required");

        return Feign.builder()
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
                .errorDecoder(new MailChimpErrorDecoder())
                .requestInterceptor(authRequestInterceptor)
                .client(client)
                .logger(logger)
                .logLevel(logLevel)
                .target(MailChimpClient.class, "https://" + apiBase + ".api.mailchimp.com");
    }
}
