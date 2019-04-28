package com.example.service;

import com.example.model.ItripMouth;

import java.util.List;

public interface ItripMouthService {
    public List<ItripMouth> findMouthAll();

    public ItripMouth findMouthId(String mouthName);
}
