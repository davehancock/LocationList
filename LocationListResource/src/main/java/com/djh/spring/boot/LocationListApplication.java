package com.djh.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author David Hancock
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.djh.spring.configuration")
public class LocationListApplication {

    private static final Logger LOG = LoggerFactory.getLogger(LocationListApplication.class);

    public static void main(String... args) {

        SpringApplication.run(LocationListApplication.class, args);
        LOG.info("Location List Started Successfully");
    }
}
