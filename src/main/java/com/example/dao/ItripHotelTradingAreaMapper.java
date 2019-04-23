package com.example.dao;

import com.example.model.ItripHotelTradingArea;
import java.util.List;

public interface ItripHotelTradingAreaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripHotelTradingArea record);

    ItripHotelTradingArea selectByPrimaryKey(Long id);

    List<ItripHotelTradingArea> selectAll();

    int updateByPrimaryKey(ItripHotelTradingArea record);
}