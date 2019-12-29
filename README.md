This is a Java wrapper around the MailChimp API.

##### Example code for using the client

    MailChimpClient mailChimpClient = MailChimpClient.builder()
      .withApiBase("us1")
      .withBasicAuthentication("abc")
      .build();
    List subscriberList = mailChimpClient.getList("123");

## Maven / Gradle

This library can be included from Maven, e.g using gradle:

    dependencies {
        compile 'com.github.letscodehu:mailchimp-java:1.0.0'
    }
    
    <dependency>
        <groupId>com.github.letscodehu</groupId>
        <artifactId>mailchimp-java</artifactId>
        <version>1.0.0</version>
    </dependency>

##### Installing

    mvn clean install
