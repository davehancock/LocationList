package com.djh.spring.configuration;

import com.djh.filter.ResourceCORSFilter;
import com.djh.location.list.core.dao.LocationListDAO;
import com.djh.location.list.core.dao.SimpleLocationListDAO;
import com.djh.location.list.rest.controller.SummaryResource;
import com.djh.location.list.core.service.DefaultSummaryService;
import com.djh.location.list.core.service.SummaryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;


/**
 * @author David Hancock
 */
@Configuration
public class LocationListConfiguration {

    @Bean
    public Filter resourceCORSFilter(){
        return new ResourceCORSFilter();
    }

    @Bean
    public LocationListDAO locationListDAO() {
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
