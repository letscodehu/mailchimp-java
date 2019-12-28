package com.mailchimp.domain.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mailchimp.domain.Address;

public class Customer {

    private String id;
    @JsonProperty("email_address")
    private String emailAddress;
    @JsonProperty("opt_in_status")
    private boolean optInStatus;
    private String company;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("orders_count")
    private int ordersCount;
    @JsonProperty("total_spent")
    private long totalSpent;
    private Address address;

    public String getId() {
        return id;
    }

    public Customer setId(final String id) {
        this.id = id;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer setEmailAddress(final String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public boolean getOptInStatus() {
        return optInStatus;
    }

    public Customer setOptInStatus(final boolean optInStatus) {
        this.optInStatus = optInStatus;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Customer setCompany(final String company) {
        this.company = company;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customer setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getOrdersCount() {
        return ordersCount;
    }

    public Customer setOrdersCount(final int ordersCount) {
        this.ordersCount = ordersCount;
        return this;
    }

    public long getTotalSpent() {
        return totalSpent;
    }

    public Customer setTotalSpent(final long totalSpent) {
        this.totalSpent = totalSpent;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Customer setAddress(final Address address) {
        this.address = address;
        return this;
    }
}
