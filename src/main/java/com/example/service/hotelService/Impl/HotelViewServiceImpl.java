package com.example.service.hotelService.Impl;

import com.example.dao.HotelViewMapper;
import com.example.model.HotelView;
import com.example.service.hotelService.HotelViewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HotelViewServiceImpl implements HotelViewService {

    @Resource
    private HotelViewMapper hotelViewMapper;

    @Override
    public List<HotelView> findHotel(int id) {
        return hotelViewMapper.selectHotHotel(id);
    }
}
