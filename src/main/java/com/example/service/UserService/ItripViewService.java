package com.example.service.UserService;

import com.example.model.HotelView;

import java.util.List;

public interface ItripViewService {
    public List<HotelView> findAllByChinaAndCityId(Long cityId);

    public List<HotelView> findAllByWaiAndCityId(Long cityId);

    public List<HotelView> randomListByChina(List<HotelView> list);

    public List<HotelView> randomListByWai(List<HotelView> list);
}
