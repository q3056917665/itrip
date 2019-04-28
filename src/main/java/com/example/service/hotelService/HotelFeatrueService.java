package com.example.service.hotelService;

import com.example.model.ItripHotelFeature;

import java.util.List;

public interface HotelFeatrueService {

    List<ItripHotelFeature> findHotelFeature(long id);
}
