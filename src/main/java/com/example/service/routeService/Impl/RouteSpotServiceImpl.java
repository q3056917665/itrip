package com.example.service.routeService.Impl;

import com.example.dao.ItripRouteSpotMapper;
import com.example.model.ItripRouteSpot;
import com.example.service.routeService.RouteSpotService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RouteSpotServiceImpl implements RouteSpotService {
    @Resource
    private ItripRouteSpotMapper itripRouteSpotMapper;

    @Override
    public List<ItripRouteSpot> findByRouteId(Long id) {
        return itripRouteSpotMapper.selectByRouteId(id);
    }
}
