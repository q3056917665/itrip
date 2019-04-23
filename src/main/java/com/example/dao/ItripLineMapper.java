package com.example.dao;

import com.example.model.ItripLine;
import java.util.List;

public interface ItripLineMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripLine record);

    ItripLine selectByPrimaryKey(Long id);

    List<ItripLine> selectAll();

    int updateByPrimaryKey(ItripLine record);
}