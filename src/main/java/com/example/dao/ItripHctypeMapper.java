package com.example.dao;

import com.example.model.ItripHctype;

import java.util.List;

public interface ItripHctypeMapper {
    int deleteByPrimaryKey(Integer hctypeId);

    int insert(ItripHctype record);

    ItripHctype selectByPrimaryKey(Integer hctypeId);

    List<ItripHctype> selectAll();

    int updateByPrimaryKey(ItripHctype record);
}