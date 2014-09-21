package com.djh.location.list.service;

import com.djh.location.list.model.SummaryItem;

/**
 * @author David Hancock
 */
public interface SummaryService {

    /**
     * @param summaryItem
     */
    public void addItem(SummaryItem summaryItem);

    /**
     * @param summaryItem
     */
    public void deleteItem(SummaryItem summaryItem);


    /**
     * @param summaryItem
     */
    public void updateItem(SummaryItem summaryItem);

}
