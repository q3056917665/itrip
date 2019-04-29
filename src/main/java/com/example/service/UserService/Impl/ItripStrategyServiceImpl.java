package com.example.service.UserService.Impl;

import com.example.dao.ItripStrategyTypeMapper;
import com.example.model.ItripStrategyType;
import com.example.service.UserService.ItripStrategyService;
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
