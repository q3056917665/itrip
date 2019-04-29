package com.example.dao;

import com.example.model.ItripHotelRoom;

import java.util.List;

public interface ItripHotelRoomMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripHotelRoom record);

    ItripHotelRoom selectByPrimaryKey(Long id);

    List<ItripHotelRoom> selectAll();

    int updateByPrimaryKey(ItripHotelRoom record);
}