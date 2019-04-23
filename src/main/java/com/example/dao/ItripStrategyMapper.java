package com.example.dao;

import com.example.model.ItripStrategy;
import java.util.List;

public interface ItripStrategyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItripStrategy record);

    ItripStrategy selectByPrimaryKey(Integer id);

    List<ItripStrategy> selectAll();

    int updateByPrimaryKey(ItripStrategy record);
}