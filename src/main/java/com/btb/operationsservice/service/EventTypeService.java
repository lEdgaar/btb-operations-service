package com.btb.operationsservice.service;

import com.btb.operationsservice.entity.EventType;
import com.btb.operationsservice.exception.EventTypeException;

public interface EventTypeService {

    EventType getEventTypeByInternalCode(String internalCode) throws EventTypeException;

}
