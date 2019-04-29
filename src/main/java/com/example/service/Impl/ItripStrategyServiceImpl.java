package com.example.service.Impl;

import com.example.dao.ItripStrategyTypeMapper;
import com.example.model.ItripStrategy;
import com.example.model.ItripStrategyType;
import com.example.service.ItripStrategyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ItripStrategyServiceImpl implements ItripStrategyService {
    @Resource
    private ItripStrategyTypeMapper itripStrategyTypeMapper;

    @Override
    public List<ItripStrategyType> findAll() {
        return itripStrategyTypeMapper.selectAll();
    }
}
