package com.djh.location.list.core.dao;

import com.djh.location.list.core.domain.SummaryItem;
import com.djh.location.list.core.domain.SummaryItems;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author David Hancock
 */
public class SimpleLocationListDAO implements LocationListDAO {

    private AtomicLong currentId = new AtomicLong();

    private ConcurrentHashMap<UUID, SummaryItem> locationListItemMap = new ConcurrentHashMap<>();

    @Override
    public void saveSummaryItem(SummaryItem summaryItem) {
        locationListItemMap.putIfAbsent(summaryItem.getId(), summaryItem);
    }

    @Override
    public void deleteSummaryItem(String summaryItemId) {
        locationListItemMap.remove(summaryItemId);
    }

    public SummaryItems findAllSummaryItems() {
        List<SummaryItem> summaryItemsList = new ArrayList<>(locationListItemMap.values());
        SummaryItems summaryItems = new SummaryItems(summaryItemsList);
        return summaryItems;
    }

    @Override
    public SummaryItem findSummaryItemById(String summaryItemId) {
        return locationListItemMap.get(summaryItemId);
    }

}
