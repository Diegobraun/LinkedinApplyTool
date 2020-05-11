package com.diegobraun.linkedinapplytool.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/linked")
public class LinkedController {

    @Autowired
    private LinkedProperties linkedinProperties;

    @GetMapping
    public String get(){
        String value = linkedinProperties.getRequestUrl();
        return value;
    }
}
