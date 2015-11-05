package com.djh.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan(basePackages = "com.djh.spring.configuration")
public class LocationListResourceApplication {

    private static final Logger LOG = LoggerFactory.getLogger(LocationListResourceApplication.class);

    public static void main(String... args) {

        SpringApplication.run(LocationListResourceApplication.class, args);
        LOG.info("Location List Resource Started Successfully");
    }
}
