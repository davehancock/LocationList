package com.djh.location.list.core.service;

import com.djh.location.list.core.dao.LocationListDAO;
import com.djh.location.list.core.dao.SimpleLocationListDAO;
import com.djh.location.list.core.domain.SummaryItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author David Hancock
 */
public class DefaultSummaryServiceTest {

    private DefaultSummaryService locationListService = new DefaultSummaryService();

    private LocationListDAO locationListDAO = new SimpleLocationListDAO();

    @Before
    public void setup(){
        locationListService.setLocationListDAO(locationListDAO);
    }

    @Test
    public void testAddItem(){

        SummaryItem summaryItem = new SummaryItem("desc","loc","time");
        locationListService.addSummaryItem(summaryItem);
        Assert.assertNotNull(summaryItem);
    }
}
