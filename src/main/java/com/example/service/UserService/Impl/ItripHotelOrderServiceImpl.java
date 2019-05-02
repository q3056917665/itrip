package com.example.service.UserService.Impl;

import com.example.dao.ItripHotelOrderMapper;
import com.example.model.ItripHotelOrder;
import com.example.service.UserService.ItripHotelOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ItripHotelOrderServiceImpl implements ItripHotelOrderService {
    @Resource
    private ItripHotelOrderMapper itripHotelOrderMapper;


    @Override
    public PageInfo<ItripHotelOrder> findAll(Long userId,Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List<ItripHotelOrder> itripHotelOrders = itripHotelOrderMapper.selectAllByUserId(userId);
        return new PageInfo<>(itripHotelOrders);
    }
}
