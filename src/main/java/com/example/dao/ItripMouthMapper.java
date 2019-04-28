package com.example.dao;

import com.example.model.ItripMouth;
import java.util.List;

public interface ItripMouthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItripMouth record);

    ItripMouth selectByPrimaryKey(Integer id);

    List<ItripMouth> selectAll();

    int updateByPrimaryKey(ItripMouth record);

    public ItripMouth selectByName(String mouthName);
}