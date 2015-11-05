package com.djh.location.list.rest.controller;

import com.djh.spring.configuration.LocationListResourceConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {LocationListResourceConfiguration.class})
public class AddNewSummaryItemIntegrationTest {

    private static final String NEW_SUMMARY_ITEM_JSON = "{\"description\": \"do something\", \"location\": \"stoke\"}";

    private MockMvc mockMvc;

    @Autowired
    private SummaryResource summaryResource;

    @Before
    public void setup() {

        this.mockMvc = standaloneSetup(summaryResource)
                .setMessageConverters(new MappingJackson2HttpMessageConverter()).build();
    }

    @Test
    public void testAddSummaryItem() throws Exception {

        this.mockMvc.perform(
                post("/summary")
                        .content(NEW_SUMMARY_ITEM_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
