package com.example.dao;

import com.example.model.HotelView;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HotelViewMapper {

    @Select("select * from Hotel_view where cityId=#{id} limit 0,6")
    List<HotelView> selectHotHotel(@Param("id")int id);

    int insert(HotelView record);

    List<HotelView> selectAll();
}