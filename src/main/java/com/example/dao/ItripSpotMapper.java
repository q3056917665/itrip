package com.example.dao;

import com.example.model.ItripSpot;
import java.util.List;

public interface ItripSpotMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripSpot record);

    ItripSpot selectByPrimaryKey(Long id);

    List<ItripSpot> selectAll();

    int updateByPrimaryKey(ItripSpot record);
}