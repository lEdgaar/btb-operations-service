package com.btb.operationsservice.persistence.mapper;

import com.btb.operationsservice.entity.HistoryEvent;

import java.util.List;

public interface HistoryEventMapper extends CommonMapper<HistoryEvent, Long>{

    List<HistoryEvent> findHistoryEventsByUserId(Long userId);

}
