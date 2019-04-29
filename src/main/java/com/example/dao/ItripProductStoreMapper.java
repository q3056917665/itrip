package com.example.dao;

import com.example.model.ItripProductStore;

import java.util.List;

public interface ItripProductStoreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripProductStore record);

    ItripProductStore selectByPrimaryKey(Long id);

    List<ItripProductStore> selectAll();

    int updateByPrimaryKey(ItripProductStore record);
}