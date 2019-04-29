package com.example.service.UserService.Impl;

import com.example.dao.ItripMouthMapper;
import com.example.model.ItripMouth;
import com.example.service.UserService.ItripMouthService;
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

}
