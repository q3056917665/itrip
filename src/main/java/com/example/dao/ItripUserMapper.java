package com.example.dao;

import com.example.model.ItripUser;
import java.util.List;

public interface ItripUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripUser record);

    ItripUser selectByPrimaryKey(Long id);

    List<ItripUser> selectAll();

    int updateByPrimaryKey(ItripUser record);
}