package com.djh.location.list.core.service;


import com.djh.location.list.core.domain.SummaryItem;

import java.util.List;

/**
 * @author David Hancock
 */
public interface SummaryService {

    public List<SummaryItem> findAllSummaryItems();

    public SummaryItem addSummaryItem(SummaryItem summaryItem);

    public void deleteSummaryItem(String summaryItemId);

    public SummaryItem updateSummaryItem(SummaryItem summaryItem);

}
