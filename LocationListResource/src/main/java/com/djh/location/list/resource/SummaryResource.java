package com.djh.location.list.resource;

import com.djh.location.list.model.SummaryItem;
import com.djh.location.list.model.SummaryItems;
import com.djh.location.list.service.SummaryService;
import org.springframework.web.bind.annotation.*;

/**
 * @author David Hancock
 *         Restful API for LocationList operations
 */
@RestController
@RequestMapping(value = "/summary")
public class SummaryResource {

    private SummaryService summaryService;

    @RequestMapping(value = "/{desc}/{location}/{timestamp}", method = RequestMethod.POST)
    public void addItem(@PathVariable("desc") String desc,
                        @PathVariable("location") String location,
                        @PathVariable("timestamp") String timestamp) {

        SummaryItem summaryItem = new SummaryItem(desc,location,timestamp);
        summaryService.addItem(summaryItem);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addWholeItem(@RequestBody SummaryItem summaryItem) {
        summaryService.addItem(summaryItem);
    }

    @RequestMapping(method = RequestMethod.GET)
    public SummaryItems getAllSummaryItems() {
        SummaryItems summaryItems = summaryService.findAllSummaryItems();
        return summaryItems;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteItem(@RequestBody SummaryItem summaryItem) {
        summaryService.deleteItem(summaryItem);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateItem(SummaryItem summaryItem) {
        summaryService.updateItem(summaryItem);
    }

    public void setSummaryService(SummaryService summaryService) {
        this.summaryService = summaryService;
    }
}
