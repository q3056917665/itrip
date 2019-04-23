package com.example.dao;

import com.example.model.ItripPeriphery;
import java.util.List;

public interface ItripPeripheryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripPeriphery record);

    ItripPeriphery selectByPrimaryKey(Long id);

    List<ItripPeriphery> selectAll();

    int updateByPrimaryKey(ItripPeriphery record);
}