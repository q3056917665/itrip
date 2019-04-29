package com.example.dao;

import com.example.model.ItripHotelOrder;

import java.util.List;

public interface ItripHotelOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripHotelOrder record);

    ItripHotelOrder selectByPrimaryKey(Long id);

    List<ItripHotelOrder> selectAll();

    int updateByPrimaryKey(ItripHotelOrder record);
}