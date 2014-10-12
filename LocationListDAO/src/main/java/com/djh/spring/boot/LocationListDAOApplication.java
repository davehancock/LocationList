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
public class LocationListDAOApplication {

    private static final Logger LOG = LoggerFactory.getLogger(LocationListDAOApplication.class);

    public static void main(String... args) {

        SpringApplication.run(LocationListDAOApplication.class, args);
        LOG.info("Location List DAO Started Successfully");
    }
}
