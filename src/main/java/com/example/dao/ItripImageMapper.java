package com.example.dao;

import com.example.model.ItripImage;

import java.util.List;

public interface ItripImageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripImage record);

    ItripImage selectByPrimaryKey(Long id);

    List<ItripImage> selectAll();

    int updateByPrimaryKey(ItripImage record);
}