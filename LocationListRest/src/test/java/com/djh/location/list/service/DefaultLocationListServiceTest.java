package com.djh.location.list.service;

import com.djh.location.list.dao.LocationListDAO;
import com.djh.location.list.dao.SimpleLocationListDAO;
import com.djh.location.list.model.LocationListItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author David Hancock
 */
public class DefaultLocationListServiceTest {

    private DefaultLocationListService locationListService = new DefaultLocationListService();

    private LocationListDAO locationListDAO = new SimpleLocationListDAO();

    @Before
    public void setup(){
        locationListService.setLocationListDAO(locationListDAO);
    }

    @Test
    public void testAddItem(){

        LocationListItem locationListItem = new LocationListItem("desc","loc","time");
        locationListService.addItem(locationListItem);
        Assert.assertNotNull(locationListItem);
    }
}
