package com.example.dao;

import com.example.model.ItripRouteSpot;
import java.util.List;

public interface ItripRouteSpotMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripRouteSpot record);

    ItripRouteSpot selectByPrimaryKey(Long id);

    List<ItripRouteSpot> selectAll();

    int updateByPrimaryKey(ItripRouteSpot record);
}