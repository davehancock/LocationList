package com.djh.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author David Hancock
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.djh.spring.configuration")
public class LocationListServiceApplication {

    private static final Logger LOG = LoggerFactory.getLogger(LocationListServiceApplication.class);

    public static void main(String... args) {

        SpringApplication.run(LocationListServiceApplication.class, args);
        LOG.info("Location List Service Started Successfully");
    }
}
