package com.btb.operationsservice.service.impl;

import com.btb.operationsservice.dto.AddEventDTO;
import com.btb.operationsservice.entity.EventType;
import com.btb.operationsservice.entity.HistoryEvent;
import com.btb.operationsservice.exception.EventTypeErrorCodes;
import com.btb.operationsservice.exception.EventTypeException;
import com.btb.operationsservice.exception.HistoryEventErrorCodes;
import com.btb.operationsservice.exception.HistoryEventException;
import com.btb.operationsservice.persistence.mapper.HistoryEventMapper;
import com.btb.operationsservice.service.EventTypeService;
import com.btb.operationsservice.service.HistoryEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HistoryEventServiceImpl implements HistoryEventService {

    @Autowired
    private HistoryEventMapper historyEventMapper;

    @Autowired
    private EventTypeService eventTypeService;

    @Override
    public List<HistoryEvent> searchEventsByUserId(Long userId) throws HistoryEventException {
        if (userId == null) {
            throw new HistoryEventException(HistoryEventErrorCodes.USER_ID_NOT_NULL, HistoryEventErrorCodes.USER_ID_NOT_NULL.getKey());
        }

        return historyEventMapper.findHistoryEventsByUserId(userId);
    }

    @Override
    public void addEvent(AddEventDTO addEventDTO) throws EventTypeException {
        HistoryEvent historyEvent = new HistoryEvent();
        historyEvent.setUserId(addEventDTO.getUserId());

        EventType eventType = eventTypeService.getEventTypeByInternalCode(addEventDTO.getEventType());

        if (eventType == null) {
            throw new EventTypeException(EventTypeErrorCodes.EVENT_TYPE_NOT_FOUND, EventTypeErrorCodes.EVENT_TYPE_NOT_FOUND.getKey());
        }

        historyEvent.setEventType(eventType);
        historyEvent.setAtDatetime(new Date());
        historyEvent.setDescription(addEventDTO.getDescription());

        historyEventMapper.save(historyEvent);
    }
}
