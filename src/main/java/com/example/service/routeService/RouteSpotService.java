package com.example.service.routeService;

import com.example.model.ItripRouteSpot;

import java.util.List;

public interface RouteSpotService {

    List<ItripRouteSpot> findByRouteId(Long id);
}

