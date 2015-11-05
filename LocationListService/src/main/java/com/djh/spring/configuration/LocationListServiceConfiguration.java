package com.djh.spring.configuration;

import com.djh.location.list.core.service.DefaultSummaryService;
import com.djh.location.list.core.service.SummaryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LocationListServiceConfiguration {


    @Bean
    public SummaryService summaryService() {
        DefaultSummaryService summaryService = new DefaultSummaryService();
        return summaryService;
    }

}
