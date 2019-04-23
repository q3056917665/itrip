package com.example.dao;

import com.example.model.ItripAviation;
import java.util.List;

public interface ItripAviationMapper {
    int deleteByPrimaryKey(Integer aviationId);

    int insert(ItripAviation record);

    ItripAviation selectByPrimaryKey(Integer aviationId);

    List<ItripAviation> selectAll();

    int updateByPrimaryKey(ItripAviation record);
}