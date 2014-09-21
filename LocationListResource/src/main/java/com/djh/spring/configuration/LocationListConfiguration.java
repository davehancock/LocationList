package com.djh.spring.configuration;

import com.djh.location.list.dao.LocationListDAO;
import com.djh.location.list.dao.SimpleLocationListDAO;
import com.djh.location.list.resource.SummaryResource;
import com.djh.location.list.service.DefaultSummaryService;
import com.djh.location.list.service.SummaryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author David Hancock
 */
@Configuration
public class LocationListConfiguration {

    @Bean
    LocationListDAO locationListDAO() {
        return new SimpleLocationListDAO();
    }

    @Bean
    public SummaryService summaryService() {
        DefaultSummaryService summaryService = new DefaultSummaryService();
        summaryService.setLocationListDAO(locationListDAO());
        return summaryService;
    }

    @Bean
    public SummaryResource summaryResource() {
        SummaryResource summaryResource = new SummaryResource();
        summaryResource.setSummaryService(summaryService());
        return summaryResource;
    }

}
