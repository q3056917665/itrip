package com.example.dao;

import com.example.model.ItripRoute;
import java.util.List;

public interface ItripRouteMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripRoute record);

    ItripRoute selectByPrimaryKey(Long id);

    List<ItripRoute> selectAll();

    int updateByPrimaryKey(ItripRoute record);
}