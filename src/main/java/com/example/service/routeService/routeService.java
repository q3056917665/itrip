package com.example.service.routeService;

import com.example.model.ItripRoute;

import java.util.List;

public interface routeService {

    public List<ItripRoute> findAll();

    public ItripRoute findById(Long id);


}
