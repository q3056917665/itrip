package com.example.dao;

import com.example.model.ItripAreaDic;
import java.util.List;

public interface ItripAreaDicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripAreaDic record);

    ItripAreaDic selectByPrimaryKey(Long id);

    List<ItripAreaDic> selectAll();

    int updateByPrimaryKey(ItripAreaDic record);
}