package com.example.dao;

import com.example.model.ItripHotelFeature;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItripHotelFeatureMapper {

    List<ItripHotelFeature> selectHotelFeature(@Param("id") long id);


    int deleteByPrimaryKey(Long id);

    int insert(ItripHotelFeature record);

    ItripHotelFeature selectByPrimaryKey(Long id);

    List<ItripHotelFeature> selectAll();

    int updateByPrimaryKey(ItripHotelFeature record);
}