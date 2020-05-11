package com.diegobraun.linkedinapplytool.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:requestUtilitaries.properties")
public class LinkedProperties {

    @Value("${linkedin.url.people}")
    private String requestUrl;

    public String getRequestUrl() {
        return requestUrl;
    }
}
