package com.btb.operationsservice.service.impl;

import com.btb.operationsservice.entity.EventType;
import com.btb.operationsservice.exception.EventTypeErrorCodes;
import com.btb.operationsservice.exception.EventTypeException;
import com.btb.operationsservice.persistence.mapper.EventTypeMapper;
import com.btb.operationsservice.service.EventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class EventTypeServiceImpl implements EventTypeService {

    @Autowired
    private EventTypeMapper eventTypeMapper;

    @Override
    public EventType getEventTypeByInternalCode(String internalCode) throws EventTypeException {
        if (!StringUtils.hasText(internalCode)) {
            throw new EventTypeException(EventTypeErrorCodes.EVENT_TYPE_INTERNAL_CODE_NOT_NULL, EventTypeErrorCodes.EVENT_TYPE_INTERNAL_CODE_NOT_NULL.getKey());
        }

        return eventTypeMapper.findEventTypeByInternalCode(internalCode);
    }
}
