package com.mailchimp.domain.store;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mailchimp.domain.Address;
import com.mailchimp.domain.Link;

public class Store {

    private String id;
    @JsonProperty("list_id")
    private String listId;
    private String name;
    private String platform;
    private String domain;
    @JsonProperty("is_syncing")
    private boolean syncing;
    @JsonProperty("email_address")
    private String emailAddress;
    @JsonProperty("currency_code")
    private String currencyCode;
    @JsonProperty("money_format")
    private String moneyFormat;
    @JsonProperty("primary_locale")
    private String primaryLocale;
    private String timezone;
    private String phone;
    private Address address;
    @JsonProperty("connected_site")
    private ConnectedSite connectedSite;
    @JsonProperty("list_is_active")
    private boolean listIsActive;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("_links")
    private List<Link> links;
    private Map<String, Automation> automations;

    public boolean isListIsActive() {
        return listIsActive;
    }

    public void setListIsActive(final boolean listIsActive) {
        this.listIsActive = listIsActive;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ConnectedSite getConnectedSite() {
        return connectedSite;
    }

    public void setConnectedSite(final ConnectedSite connectedSite) {
        this.connectedSite = connectedSite;
    }

    public Map<String, Automation> getAutomations() {
        return automations;
    }

    public void setAutomations(final Map<String, Automation> automations) {
        this.automations = automations;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getListId() {
        return listId;
    }

    public void setListId(final String listId) {
        this.listId = listId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(final String platform) {
        this.platform = platform;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(final String domain) {
        this.domain = domain;
    }

    public boolean isSyncing() {
        return syncing;
    }

    public void setSyncing(final boolean syncing) {
        this.syncing = syncing;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(final String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getMoneyFormat() {
        return moneyFormat;
    }

    public void setMoneyFormat(final String moneyFormat) {
        this.moneyFormat = moneyFormat;
    }

    public String getPrimaryLocale() {
        return primaryLocale;
    }

    public void setPrimaryLocale(final String primaryLocale) {
        this.primaryLocale = primaryLocale;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(final String timezone) {
        this.timezone = timezone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(final List<Link> links) {
        this.links = links;
    }

    public static class ConnectedSite {

        @JsonProperty("site_foreign_id")
        private String siteForeignId;

        @JsonProperty("site_script")
        private SiteScript siteScript;

        public String getSiteForeignId() {
            return siteForeignId;
        }

        public void setSiteForeignId(final String siteForeignId) {
            this.siteForeignId = siteForeignId;
        }

        public SiteScript getSiteScript() {
            return siteScript;
        }

        public ConnectedSite setSiteScript(final SiteScript siteScript) {
            this.siteScript = siteScript;
            return this;
        }

        public static class SiteScript {

            private String url;
            private String fragment;

            public String getUrl() {
                return url;
            }

            public void setUrl(final String url) {
                this.url = url;
            }

            public String getFragment() {
                return fragment;
            }

            public void setFragment(final String fragment) {
                this.fragment = fragment;
            }
        }
    }

    public static final class Automation {

        @JsonProperty("is_supported")
        private boolean isSupported;
        private String id;
        private String status;

        public boolean isSupported() {
            return isSupported;
        }

        public void setSupported(final boolean supported) {
            isSupported = supported;
        }

        public String getId() {
            return id;
        }

        public void setId(final String id) {
            this.id = id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(final String status) {
            this.status = status;
        }
    }

}
