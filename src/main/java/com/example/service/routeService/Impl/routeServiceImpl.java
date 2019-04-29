package com.example.service.routeService.Impl;

import com.example.dao.ItripRouteMapper;
import com.example.model.ItripRoute;
import com.example.service.routeService.routeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class routeServiceImpl implements routeService {
    @Resource
    private ItripRouteMapper itripRouteMapper;

    @Override
    public List<ItripRoute> findAll() {
        return itripRouteMapper.selectAll();
    }

    @Override
    public ItripRoute findById(Long id) {
        return itripRouteMapper.selectByPrimaryKey(id);
    }
}
