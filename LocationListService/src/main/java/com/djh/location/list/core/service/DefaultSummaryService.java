package com.djh.location.list.core.service;

import com.djh.location.list.core.domain.SummaryItem;

import java.util.Date;
import java.util.List;


public class DefaultSummaryService implements SummaryService {

    //private LocationListDAO locationListDAO;

    @Override
    public SummaryItem addSummaryItem(SummaryItem summaryItem) {
        summaryItem.setTimestamp(new Date());
        return null;
    }

    @Override
    public void deleteSummaryItem(String summaryItemId) {
        //locationListDAO.deleteSummaryItem(summaryItemId);
    }

    @Override
    public List<SummaryItem> findAllSummaryItems() {
        //List<SummaryItem> summaryItemsList = locationListDAO.findAllSummaryItems();
        return null;
    }

    @Override
    public void updateSummaryItem(String summaryItemId, SummaryItem summaryItem) {
        // NO-OP TODO
    }

    //public void setLocationListDAO(LocationListDAO locationListDAO) {
       // this.locationListDAO = locationListDAO;
    //}
}
