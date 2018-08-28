package com.likun.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdDBConnector implements DBConnector {
    @Override
    public String configure() {
        return "prod db";
    }
}
