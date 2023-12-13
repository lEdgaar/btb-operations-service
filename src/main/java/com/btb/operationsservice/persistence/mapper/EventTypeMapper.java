package com.btb.operationsservice.persistence.mapper;

import com.btb.operationsservice.entity.EventType;

public interface EventTypeMapper extends CommonMapper<EventType, Long> {

    EventType findEventTypeByInternalCode(String internalCode);

}
