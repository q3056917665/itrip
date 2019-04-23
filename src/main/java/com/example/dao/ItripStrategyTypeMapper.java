package com.example.dao;

import com.example.model.ItripStrategyType;
import java.util.List;

public interface ItripStrategyTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItripStrategyType record);

    ItripStrategyType selectByPrimaryKey(Integer id);

    List<ItripStrategyType> selectAll();

    int updateByPrimaryKey(ItripStrategyType record);
}