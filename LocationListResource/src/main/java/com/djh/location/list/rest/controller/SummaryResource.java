package com.djh.location.list.rest.controller;

import com.djh.location.list.core.domain.SummaryItem;
import com.djh.location.list.core.service.SummaryService;
import com.djh.location.list.rest.domain.SummaryItemRest;
import com.djh.location.list.rest.domain.SummaryItems;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author David Hancock
 *         Restful API for LocationList operations
 */
@RestController
@RequestMapping(value = "/summary")
public class SummaryResource {

    private SummaryService summaryService;

    @RequestMapping(method = RequestMethod.POST)
    public SummaryItemRest addSummaryItem(@RequestBody SummaryItemRest summaryItemRest) {

        // TODO Refine model indirection
        SummaryItem summaryItem = summaryItemRest.toSummaryItem();

        SummaryItem summaryItemResult = summaryService.addSummaryItem(summaryItem);

        // TODO Refine model indirection
        return summaryItemRest.fromSummaryItem(summaryItemResult);
    }

    @RequestMapping(value = "/{summaryItemId}", method = RequestMethod.PUT)
    public void updateSummaryItem(@PathVariable String summaryItemId, @RequestBody SummaryItemRest summaryItemRest) {

        // TODO Refine model indirection
        SummaryItem summaryItem = summaryItemRest.toSummaryItem();

        summaryService.updateSummaryItem(summaryItemId, summaryItem);
    }

    @RequestMapping(method = RequestMethod.GET)
    public SummaryItems getAllSummaryItems() {

        List<SummaryItem> summaryItemList = summaryService.findAllSummaryItems();

        // TODO Refine model indirection
        List<SummaryItemRest> summaryItemRestList = new ArrayList<>();

        for (SummaryItem summaryItem : summaryItemList) {
            SummaryItemRest summaryItemRest = new SummaryItemRest();
            summaryItemRest = summaryItemRest.fromSummaryItem(summaryItem);
            summaryItemRestList.add(summaryItemRest);
        }

        SummaryItems summaryItems = new SummaryItems(summaryItemRestList);

        return summaryItems;
    }

    @RequestMapping(value = "/{summaryItemId}", method = RequestMethod.DELETE)
    public void deleteSummaryItem(@PathVariable String summaryItemId) {
        summaryService.deleteSummaryItem(summaryItemId);
    }

    public void setSummaryService(SummaryService summaryService) {
        this.summaryService = summaryService;
    }
}
