package com.djh.spring.configuration;

import com.djh.location.list.core.dao.LocationListDAO;
import com.djh.location.list.core.dao.SimpleLocationListDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author David Hancock
 */
@Configuration
public class LocationListDAOConfiguration {

    @Bean
    public LocationListDAO locationListDAO() {
        return new SimpleLocationListDAO();
    }
}
