package com.example.service.hotelService.Impl;

import com.example.dao.ItripHotelMapper;
import com.example.model.ItripHotel;
import com.example.service.hotelService.ItripHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItripHotelServiceImpl implements ItripHotelService {

    @Autowired
    private ItripHotelMapper dao;

    @Override
    public ItripHotel findById(long id) {
        return dao.selectByPrimaryKey(id);
    }
}
