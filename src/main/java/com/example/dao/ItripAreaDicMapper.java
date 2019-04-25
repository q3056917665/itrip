package com.example.dao;

import com.example.model.ItripAreaDic;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItripAreaDicMapper {

    //查询海外城市名
    @Select("select id,name from itrip_area_dic where isChina=2")
    List<ItripAreaDic> selectSeaCity();

    @Select("select * from itrip_area_dic where isChina=1 and isHot=1")
    List<ItripAreaDic> selectHotCity();


    int deleteByPrimaryKey(Long id);

    int insert(ItripAreaDic record);

    ItripAreaDic selectByPrimaryKey(Long id);

    List<ItripAreaDic> selectAll();

    int updateByPrimaryKey(ItripAreaDic record);
}