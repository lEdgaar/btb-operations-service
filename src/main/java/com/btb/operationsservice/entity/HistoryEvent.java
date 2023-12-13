package com.btb.operationsservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HistoryEvent extends BaseModel<Long>{

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long userId;

    private EventType eventType;

    private Date atDatetime;

    private String description;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

}
