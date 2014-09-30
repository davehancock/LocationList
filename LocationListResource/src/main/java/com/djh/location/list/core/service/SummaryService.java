package com.djh.location.list.core.service;

import com.djh.location.list.core.domain.SummaryItem;
import com.djh.location.list.core.domain.SummaryItems;

/**
 * @author David Hancock
 */
public interface SummaryService {

    public SummaryItems findAllSummaryItems();

    public void addSummaryItem(SummaryItem summaryItem);

    public void deleteSummaryItem(String summaryItemId);

    public void updateSummaryItem(String summaryItemId, SummaryItem summaryItem);

}
