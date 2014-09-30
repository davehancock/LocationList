package com.djh.location.list.core.service;

import com.djh.location.list.core.dao.LocationListDAO;
import com.djh.location.list.core.domain.SummaryItem;
import com.djh.location.list.core.domain.SummaryItems;

/**
 * @author David Hancock
 */
public class DefaultSummaryService implements SummaryService {

    private LocationListDAO locationListDAO;

    @Override
    public void addSummaryItem(SummaryItem summaryItem) {
        locationListDAO.saveSummaryItem(summaryItem);
    }

    @Override
    public void deleteSummaryItem(String summaryItemId) {
        locationListDAO.deleteSummaryItem(summaryItemId);
    }

    @Override
    public SummaryItems findAllSummaryItems() {
        return locationListDAO.findAllSummaryItems();
    }

    @Override
    public void updateSummaryItem(String summaryItemId, SummaryItem summaryItem) {
        // NO-OP TODO
    }

    public void setLocationListDAO(LocationListDAO locationListDAO) {
        this.locationListDAO = locationListDAO;
    }
}
