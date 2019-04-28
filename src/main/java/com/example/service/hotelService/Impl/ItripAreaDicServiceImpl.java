package com.example.service.hotelService.Impl;

import com.example.dao.ItripAreaDicMapper;
import com.example.service.hotelService.ItripAreaDicService;
import com.example.model.ItripAreaDic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItripAreaDicServiceImpl implements ItripAreaDicService {
    @Autowired
    private ItripAreaDicMapper dao;

    @Override
    public List<ItripAreaDic> findSeaCity() {
        return dao.selectSeaCity();
    }

    @Override
    public List<ItripAreaDic> findHotCity() { return dao.selectHotCity(); }
}
