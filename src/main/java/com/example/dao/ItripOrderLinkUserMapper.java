package com.example.dao;

import com.example.model.ItripOrderLinkUser;

import java.util.List;

public interface ItripOrderLinkUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripOrderLinkUser record);

    ItripOrderLinkUser selectByPrimaryKey(Long id);

    List<ItripOrderLinkUser> selectAll();

    int updateByPrimaryKey(ItripOrderLinkUser record);
}