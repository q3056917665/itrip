package com.example.dao;

import com.example.model.ItripCityNamePictures;
import java.util.List;

public interface ItripCityNamePicturesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItripCityNamePictures record);

    ItripCityNamePictures selectByPrimaryKey(Integer id);

    List<ItripCityNamePictures> selectAll();

    int updateByPrimaryKey(ItripCityNamePictures record);

    List<ItripCityNamePictures> selctAllByMouthId(Integer mouthId);

    List<ItripCityNamePictures> selctAllByTypeId(Integer typeId);
}