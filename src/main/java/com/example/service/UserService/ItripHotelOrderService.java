package com.example.service.UserService;

import com.example.model.ItripHotelOrder;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ItripHotelOrderService {

    public PageInfo<ItripHotelOrder> findAll(Long userId,Integer page,Integer pageSize);

}
