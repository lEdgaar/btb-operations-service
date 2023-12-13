package com.btb.operationsservice.controller;

import com.btb.operationsservice.dto.AddEventDTO;
import com.btb.operationsservice.entity.HistoryEvent;
import com.btb.operationsservice.exception.EventTypeException;
import com.btb.operationsservice.exception.HistoryEventException;
import com.btb.operationsservice.service.HistoryEventService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/events")
public class EventController {

    private HistoryEventService historyEventService;

    @Autowired
    public EventController(HistoryEventService historyEventService) {
        this.historyEventService = historyEventService;
    }

    @GetMapping("/{userId}")
    public @ResponseBody List<HistoryEvent> searchEventsByUserId(@PathVariable("userId") Long userId) throws HistoryEventException {
        log.trace("GET / userId: {}", userId);

        log.info("RecurrentEvent: List HistoryEvent by userId: {}", userId);
        return historyEventService.searchEventsByUserId(userId);
    }

    @PostMapping("/")
    public void addEvent(@RequestBody AddEventDTO addEventDTO) throws EventTypeException {
        log.trace("POST / userId: {}", addEventDTO.getUserId());

        log.info("RecurrentEvent: Create HistoryEvent to userId: {} from {}", addEventDTO.getUserId(), addEventDTO.getEventType());
        historyEventService.addEvent(addEventDTO);
    }


}
