package com.example.dao;

import com.example.model.ItripType;
import java.util.List;

public interface ItripTypeMapper {
    int deleteByPrimaryKey(Long typeId);

    int insert(ItripType record);

    ItripType selectByPrimaryKey(Long typeId);

    List<ItripType> selectAll();

    int updateByPrimaryKey(ItripType record);
}