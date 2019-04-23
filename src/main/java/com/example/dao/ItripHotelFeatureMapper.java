package com.example.dao;

import com.example.model.ItripHotelFeature;
import java.util.List;

public interface ItripHotelFeatureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripHotelFeature record);

    ItripHotelFeature selectByPrimaryKey(Long id);

    List<ItripHotelFeature> selectAll();

    int updateByPrimaryKey(ItripHotelFeature record);
}