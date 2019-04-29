package com.example.dao;

import com.example.model.ItripGroups;

import java.util.List;

public interface ItripGroupsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripGroups record);

    ItripGroups selectByPrimaryKey(Long id);

    List<ItripGroups> selectAll();

    int updateByPrimaryKey(ItripGroups record);
}