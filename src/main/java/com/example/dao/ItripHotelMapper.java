package com.example.dao;

import com.example.model.ItripHotel;

import java.util.List;

public interface ItripHotelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripHotel record);

    ItripHotel selectByPrimaryKey(Long id);

    List<ItripHotel> selectAll();

    int updateByPrimaryKey(ItripHotel record);
}