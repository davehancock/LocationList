package com.djh.location.list.dao;

import com.djh.location.list.model.SummaryItem;
import com.djh.location.list.model.SummaryItems;

import java.util.List;

/**
 * @author David Hancock
 */
public interface LocationListDAO {

    void saveLocationListItem(SummaryItem summaryItem);

    void deleteLocationListItem(SummaryItem locationListItemId);

    SummaryItems findAllSummaryItems();

    SummaryItem findSummaryItemById(Long locationListItemId);

}
