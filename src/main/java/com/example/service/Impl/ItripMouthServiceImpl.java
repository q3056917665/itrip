package com.example.service.Impl;

import com.example.dao.ItripMouthMapper;
import com.example.model.ItripMouth;
import com.example.service.ItripMouthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ItripMouthServiceImpl implements ItripMouthService {
    @Resource
    private ItripMouthMapper itripMouthMapper;

    @Override
    public List<ItripMouth> findMouthAll() {
        return itripMouthMapper.selectAll();
    }

    @Override
    public ItripMouth findMouthId(String mouthName) {
        return itripMouthMapper.selectByName(mouthName);
    }
}
