package com.djh.location.list.service;

import com.djh.location.list.dao.LocationListDAO;
import com.djh.location.list.model.SummaryItem;

/**
 * @author David Hancock
 */
public class DefaultSummaryService implements SummaryService {

    private LocationListDAO locationListDAO;

    @Override
    public void addItem(SummaryItem summaryItem) {
        locationListDAO.saveLocationListItem(summaryItem);
    }

    @Override
    public void deleteItem(SummaryItem summaryItem) {
        locationListDAO.deleteLocationListItem(null);
    }

    @Override
    public void updateItem(SummaryItem summaryItem) {

    }

    public void setLocationListDAO(LocationListDAO locationListDAO) {
        this.locationListDAO = locationListDAO;
    }
}
