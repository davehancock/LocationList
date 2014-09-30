package com.djh.location.list.core.dao;

import com.djh.location.list.core.domain.SummaryItem;
import com.djh.location.list.core.domain.SummaryItems;

/**
 * @author David Hancock
 */
public interface LocationListDAO {

    void saveSummaryItem(SummaryItem summaryItem);

    void deleteSummaryItem(String summaryItemId);

    SummaryItems findAllSummaryItems();

    SummaryItem findSummaryItemById(String summaryItemId);

}
