package com.mailchimp.domain.customer;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mailchimp.domain.Address;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerCreate {

    private final String id;
    @JsonProperty("email_address")
    private final String emailAddress;
    @JsonProperty("opt_in_status")
    private final boolean optInStatus;
    private final String company;
    @JsonProperty("first_name")
    private final String firstName;
    @JsonProperty("last_name")
    private final String lastName;
    @JsonProperty("orders_count")
    private final int ordersCount;
    @JsonProperty("total_spent")
    private final long totalSpent;
    private final Address address;

    private CustomerCreate(final Builder builder) {
        this.id = builder.id;
        this.emailAddress = builder.emailAddress;
        this.optInStatus = builder.optInStatus;
        this.company = builder.company;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.ordersCount = builder.ordersCount;
        this.totalSpent = builder.totalSpent;
        this.address = builder.address;
    }

    /**
     * Returns a new builder instance.
     * @return Builder
     */
    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public boolean getOptInStatus() {
        return optInStatus;
    }

    public String getCompany() {
        return company;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getOrdersCount() {
        return ordersCount;
    }

    public long getTotalSpent() {
        return totalSpent;
    }

    public Address getAddress() {
        return address;
    }

    public static final class Builder {

        private String id;
        private String emailAddress;
        private boolean optInStatus;
        private String company;
        private String firstName;
        private String lastName;
        private int ordersCount;
        private long totalSpent;
        private Address address;

        public Builder setId(final String id) {
            this.id = id;
            return this;
        }

        public Builder setEmailAddress(final String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setOptInStatus(final boolean optInStatus) {
            this.optInStatus = optInStatus;
            return this;
        }

        public Builder setCompany(final String company) {
            this.company = company;
            return this;
        }

        public Builder setFirstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setOrdersCount(final int ordersCount) {
            this.ordersCount = ordersCount;
            return this;
        }

        public Builder setTotalSpent(final long totalSpent) {
            this.totalSpent = totalSpent;
            return this;
        }

        public Builder setAddress(final Address address) {
            this.address = address;
            return this;
        }

        /**
         * Builds a new object after validating the necessary fields.
         * @return CustomerCreate
         */
        public CustomerCreate build() {
            if (Objects.isNull(this.id) || Objects.isNull(this.emailAddress)) {
                throw new IllegalStateException("Required fields are id, email_address, opt_in_status");
            }
            return new CustomerCreate(this);
        }

    }

}
