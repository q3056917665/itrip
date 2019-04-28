package com.example.dao;

import com.example.model.ItripRouteFeature;
import java.util.List;

public interface ItripRouteFeatureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripRouteFeature record);

    ItripRouteFeature selectByPrimaryKey(Long id);

    List<ItripRouteFeature> selectAll();

    int updateByPrimaryKey(ItripRouteFeature record);
}