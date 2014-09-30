package com.djh.location.list.core.service;

import com.djh.location.list.core.dao.LocationListDAO;
import com.djh.location.list.core.domain.SummaryItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.UUID;

/**
 * @author David Hancock
 */
@RunWith(MockitoJUnitRunner.class)
public class DefaultSummaryServiceTest {

    @Mock
    private LocationListDAO locationListDAO;

    @InjectMocks
    private DefaultSummaryService locationListService = new DefaultSummaryService();

    @Test
    public void testAddSummaryItem() {

        SummaryItem summaryItem = new SummaryItem("Desc", "Location");

        locationListService.addSummaryItem(summaryItem);
        Mockito.verify(locationListDAO).saveSummaryItem(Mockito.any(SummaryItem.class));

        Assert.assertTrue(summaryItem.getTimestamp() != null);
    }
}
