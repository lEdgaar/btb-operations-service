package com.btb.operationsservice.service;

import com.btb.operationsservice.dto.AddEventDTO;
import com.btb.operationsservice.entity.HistoryEvent;
import com.btb.operationsservice.exception.EventTypeException;
import com.btb.operationsservice.exception.HistoryEventException;

import java.util.List;

public interface HistoryEventService {

    List<HistoryEvent> searchEventsByUserId(Long userId) throws HistoryEventException;

    void addEvent(AddEventDTO addEventDTO) throws EventTypeException;

}
