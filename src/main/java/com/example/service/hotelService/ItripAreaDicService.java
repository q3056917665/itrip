package com.example.service.hotelService;


import com.example.model.ItripAreaDic;

import java.util.List;

//区域字典表
public interface ItripAreaDicService {

    //查询海外酒店
    List<ItripAreaDic> findSeaCity();
    //查询热门酒店名
    List<ItripAreaDic> findHotCity();
}
