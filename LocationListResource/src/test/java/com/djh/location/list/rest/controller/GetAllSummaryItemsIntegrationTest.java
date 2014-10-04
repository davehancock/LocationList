package com.djh.location.list.rest.controller;

import com.djh.location.list.core.dao.LocationListDAO;
import com.djh.location.list.core.domain.SummaryItem;
import com.djh.spring.configuration.LocationListConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * @author David Hancock
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {LocationListConfiguration.class})
public class GetAllSummaryItemsIntegrationTest {

    private static final String NEW_SUMMARY_ITEM_JSON = "{\"description\": \"do something\", \"location\": \"stoke\"}";

    private MockMvc mockMvc;

    @Autowired
    private LocationListDAO locationListDAO;

    @Autowired
    private SummaryResource summaryResource;

    @Before
    public void setup() {

        this.mockMvc = standaloneSetup(summaryResource)
                .setMessageConverters(new MappingJackson2HttpMessageConverter()).build();

        SummaryItem summaryItem1 = new SummaryItem("Desc1","Loc1");
        SummaryItem summaryItem2 = new SummaryItem("Desc2", "Loc2");

        locationListDAO.saveSummaryItem(summaryItem1);
        locationListDAO.saveSummaryItem(summaryItem2);
    }

    @Test
    public void testAddSummaryItem() throws Exception {

        this.mockMvc.perform(
                get("/summary")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
