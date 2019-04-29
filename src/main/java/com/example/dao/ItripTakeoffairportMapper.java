package com.example.dao;

import com.example.model.ItripTakeoffairport;

import java.util.List;

public interface ItripTakeoffairportMapper {
    int deleteByPrimaryKey(Integer takeId);

    int insert(ItripTakeoffairport record);

    ItripTakeoffairport selectByPrimaryKey(Integer takeId);

    List<ItripTakeoffairport> selectAll();

    int updateByPrimaryKey(ItripTakeoffairport record);
}