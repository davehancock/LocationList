package com.djh.location.list.core.dao;

import com.djh.location.list.core.domain.SummaryItem;

import java.util.List;

/**
 * @author David Hancock
 */
public interface LocationListDAO {

    SummaryItem saveSummaryItem(SummaryItem summaryItem);

    void deleteSummaryItem(String summaryItemId);

    List<SummaryItem> findAllSummaryItems();

    SummaryItem updateSummaryItem(SummaryItem summaryItem);

}
