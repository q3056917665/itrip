package com.example.service;

import com.example.model.ItripCityNamePictures;

import java.util.List;

public interface ItripCityNamePicturesService {
    public List<ItripCityNamePictures> findAllByMouth(Integer mouthId);

    public List<ItripCityNamePictures> findAllByType(Integer typeId);

    public String getMouthId();
}
