package com.djh.location.list.service;

import com.djh.location.list.dao.LocationListDAO;
import com.djh.location.list.model.LocationListItem;

/**
 * @author David Hancock
 */
public class DefaultLocationListService implements LocationListService {

    private LocationListDAO locationListDAO;

    @Override
    public void addItem(LocationListItem locationListItem) {
        locationListDAO.saveLocationListItem(locationListItem);
    }

    @Override
    public void deleteItem(LocationListItem locationListItem) {
        locationListDAO.deleteLocationListItem(null);
    }

    @Override
    public void updateItem(LocationListItem locationListItem) {

    }

    public void setLocationListDAO(LocationListDAO locationListDAO) {
        this.locationListDAO = locationListDAO;
    }
}
