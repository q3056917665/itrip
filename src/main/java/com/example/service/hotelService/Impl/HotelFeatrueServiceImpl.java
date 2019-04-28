package com.example.service.hotelService.Impl;

import com.example.dao.ItripHotelFeatureMapper;
import com.example.service.hotelService.HotelFeatrueService;
import com.example.model.ItripHotelFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelFeatrueServiceImpl implements HotelFeatrueService {
    @Autowired
    private ItripHotelFeatureMapper dao;

    @Override
    public List<ItripHotelFeature> findHotelFeature(long id) {
        return dao.selectHotelFeature(id);
    }
}
