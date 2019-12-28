package com.mailchimp.integration;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.delete;
import static com.github.tomakehurst.wiremock.client.WireMock.equalToJson;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

import org.junit.ClassRule;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.mailchimp.MailChimpClient;
import com.mailchimp.MailChimpErrorDecoder;
import com.mailchimp.jackson.JacksonDecoder;
import com.mailchimp.jackson.JacksonEncoder;

import feign.Client;
import feign.Feign;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;

public abstract class AbstractIntegrationTest {

    public static final String USERNAME = "anyString";
    public static final String PASSWORD = "password";

    @ClassRule
    public static WireMockRule wireMockRule = new WireMockRule(options().port(32543));

    protected final MailChimpClient mailChimpClient = Feign.builder()
            .decoder(new JacksonDecoder())
            .encoder(new JacksonEncoder())
            .errorDecoder(new MailChimpErrorDecoder())
            .requestInterceptor(new BasicAuthRequestInterceptor(USERNAME, PASSWORD))
            .client(new Client.Default(null, null))
            .logger(new Logger.NoOpLogger())
            .logLevel(Logger.Level.NONE)
            .target(MailChimpClient.class, "http://localhost:32543");

    protected void expectPost(String url, String requestBodyFile, String responseBodyFile) throws IOException {
        String requestBody = getClassPathContent("request/" + requestBodyFile);
        String responseBody = getClassPathContent("response/" + responseBodyFile);
        wireMockRule.stubFor(post(urlEqualTo(url))
                .withRequestBody(equalToJson(requestBody))
                .willReturn(aResponse().withBody(responseBody))
                .withBasicAuth(USERNAME, PASSWORD));
    }

    protected void expectDelete(String url) {
        wireMockRule.stubFor(delete(urlEqualTo(url))
                .withBasicAuth(USERNAME, PASSWORD)
                .willReturn(aResponse().withStatus(204)));
    }

    protected void expectGet(String url, String responseBodyFile) throws IOException {
        String responseBody = getClassPathContent("response/" + responseBodyFile);
        wireMockRule.stubFor(get(urlEqualTo(url))
                .willReturn(aResponse().withBody(responseBody))
                .withBasicAuth(USERNAME, PASSWORD));
    }

    private String getClassPathContent(final String requestBodyFile) {
        InputStream inputStream = Objects
                .requireNonNull(this.getClass().getClassLoader().getResourceAsStream(requestBodyFile),
                        "The file " + requestBodyFile + " cannot be found on the classpath!");
        return new Scanner(new InputStreamReader(
                inputStream)).useDelimiter("\\A").next();
    }

}
