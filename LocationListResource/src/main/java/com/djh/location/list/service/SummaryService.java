package com.djh.location.list.service;

import com.djh.location.list.model.SummaryItem;
import com.djh.location.list.model.SummaryItems;

/**
 * @author David Hancock
 */
public interface SummaryService {

    public void addItem(SummaryItem summaryItem);

    public void deleteItem(SummaryItem summaryItem);

    public SummaryItems findAllSummaryItems();

    public void updateItem(SummaryItem summaryItem);

}
