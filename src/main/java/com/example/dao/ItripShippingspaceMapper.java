package com.example.dao;

import com.example.model.ItripShippingspace;

import java.util.List;

public interface ItripShippingspaceMapper {
    int deleteByPrimaryKey(Integer shippingId);

    int insert(ItripShippingspace record);

    ItripShippingspace selectByPrimaryKey(Integer shippingId);

    List<ItripShippingspace> selectAll();

    int updateByPrimaryKey(ItripShippingspace record);
}