package com.djh.location.list.service;

import com.djh.location.list.dao.LocationListDAO;
import com.djh.location.list.model.SummaryItem;
import com.djh.location.list.model.SummaryItems;

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
        locationListDAO.deleteLocationListItem(summaryItem);
    }

    @Override
    public SummaryItems findAllSummaryItems() {
        return locationListDAO.findAllSummaryItems();
    }

    @Override
    public void updateItem(SummaryItem summaryItem) {
        // NO-OP TODO
    }

    public void setLocationListDAO(LocationListDAO locationListDAO) {
        this.locationListDAO = locationListDAO;
    }
}
