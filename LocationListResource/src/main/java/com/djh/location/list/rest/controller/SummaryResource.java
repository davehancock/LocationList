package com.djh.location.list.rest.controller;

import com.djh.location.list.core.domain.SummaryItem;
import com.djh.location.list.core.domain.SummaryItems;
import com.djh.location.list.core.service.SummaryService;
import org.springframework.web.bind.annotation.*;

/**
 * @author David Hancock
 *         Restful API for LocationList operations
 */
@RestController
@RequestMapping(value = "/summary")
public class SummaryResource {

    private SummaryService summaryService;

    @RequestMapping(method = RequestMethod.POST)
    public void addSummaryItem(@RequestBody SummaryItem summaryItem) {
        summaryService.addSummaryItem(summaryItem);
    }

    @RequestMapping(value= "/{summaryItemId}",method = RequestMethod.PUT)
    public void updateSummaryItem(@PathVariable String summaryItemId, @RequestBody SummaryItem summaryItem) {
        summaryService.updateSummaryItem(summaryItemId, summaryItem);
    }

    @RequestMapping(method = RequestMethod.GET)
    public SummaryItems getAllSummaryItems() {
        SummaryItems summaryItems = summaryService.findAllSummaryItems();
        return summaryItems;
    }

    @RequestMapping(value= "/{summaryItemId}", method = RequestMethod.DELETE)
    public void deleteSummaryItem(@PathVariable String summaryItemId) {
        summaryService.deleteSummaryItem(summaryItemId);
    }

    public void setSummaryService(SummaryService summaryService) {
        this.summaryService = summaryService;
    }
}
