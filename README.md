This is a Java wrapper around the MailChimp API.
[![Build Status](http://build.letscode.hu/buildStatus/icon?job=Mailchimp+Java+SDK)](http://build.letscode.hu/job/Mailchimp%20Java%20SDK/)
##### Example code for using the client

    MailChimpClient mailChimpClient = MailChimpClient.builder()
      .withApiBase("us1")
      .withBasicAuthentication("abc")
      .build();
    List subscriberList = mailChimpClient.getList("123");

## Maven / Gradle

This library can be included from Maven, e.g using gradle:

    dependencies {
        compile 'hu.letscode:mailchimp-java:1.1.3'
    }
    
    <dependency>
        <groupId>hu.letscode</groupId>
        <artifactId>mailchimp-java</artifactId>
        <version>1.1.3</version>
    </dependency>

##### Installing

    mvn clean install
