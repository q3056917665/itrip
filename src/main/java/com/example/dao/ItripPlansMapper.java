package com.example.dao;

import com.example.model.ItripPlans;

import java.util.List;

public interface ItripPlansMapper {
    int deleteByPrimaryKey(Integer planId);

    int insert(ItripPlans record);

    ItripPlans selectByPrimaryKey(Integer planId);

    List<ItripPlans> selectAll();

    int updateByPrimaryKey(ItripPlans record);
}