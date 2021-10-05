package com.test.naocs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    private static final Logger LOG = LoggerFactory.getLogger(ProviderController.class);

    @GetMapping("/service")
    public String service(){
        LOG.info("provider invoke1");
        return "provider invoke1";

    }
}
