package com.djh.location.list.core.dao;

import com.djh.location.list.core.domain.SummaryItem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;


public class SimpleLocationListDAO implements LocationListDAO {

    private AtomicLong currentId = new AtomicLong();

    private ConcurrentHashMap<UUID, SummaryItem> locationListItemMap = new ConcurrentHashMap<>();

    @Override
    public SummaryItem saveSummaryItem(SummaryItem summaryItem) {
        locationListItemMap.putIfAbsent(summaryItem.getId(), summaryItem);
        return summaryItem;
    }

    @Override
    public void deleteSummaryItem(String summaryItemId) {
        locationListItemMap.remove(UUID.fromString(summaryItemId));
    }

    public List<SummaryItem> findAllSummaryItems() {
        List<SummaryItem> summaryItemsList = new ArrayList<>(locationListItemMap.values());
        return summaryItemsList;
    }

    @Override
    public SummaryItem findSummaryItemById(String summaryItemId) {
        return locationListItemMap.get(summaryItemId);
    }

}
