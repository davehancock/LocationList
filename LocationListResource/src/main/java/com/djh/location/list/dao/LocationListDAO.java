package com.djh.location.list.dao;

import com.djh.location.list.model.SummaryItem;

import java.util.List;

/**
 * @author David Hancock
 */
public interface LocationListDAO {

    void saveLocationListItem(SummaryItem summaryItem);

    void deleteLocationListItem(Long locationListItemId);

    List<SummaryItem> findAllLocationListItems();

    SummaryItem findLocationListItemById(Long locationListItemId);

}
