package com.example.dao;

import com.example.model.ItripRouteOrder;

import java.util.List;

public interface ItripRouteOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripRouteOrder record);

    ItripRouteOrder selectByPrimaryKey(Long id);

    List<ItripRouteOrder> selectAll();

    int updateByPrimaryKey(ItripRouteOrder record);
}