package com.likun.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix="com.md")
@PropertySource("classpath:test.properties")
public class ConfigTestBean {
    private String author;
    private String name;
    private String secret;
    private String number;

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSecret() {
        return secret;
    }

    public String getNumber() {
        return number;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
