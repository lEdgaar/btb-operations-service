package com.btb.operationsservice.persistence.mapper;

import com.btb.operationsservice.entity.BaseModel;

import java.io.Serializable;
import java.util.List;

public interface CommonMapper<E extends BaseModel<ID>, ID extends Serializable>{

    int delete(ID id);

    int save(E Entity);

    E findById(ID id);

    List<E> findAll();

    List<E> findByFilter(E Entity);

    int update(E Entity);

}