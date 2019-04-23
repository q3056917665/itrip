package com.example.dao;

import com.example.model.ItripFeature;
import java.util.List;

public interface ItripFeatureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripFeature record);

    ItripFeature selectByPrimaryKey(Long id);

    List<ItripFeature> selectAll();

    int updateByPrimaryKey(ItripFeature record);
}