package com.example.dao;

import com.example.model.ItripTypeji;

import java.util.List;

public interface ItripTypejiMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(ItripTypeji record);

    ItripTypeji selectByPrimaryKey(Integer typeId);

    List<ItripTypeji> selectAll();

    int updateByPrimaryKey(ItripTypeji record);
}