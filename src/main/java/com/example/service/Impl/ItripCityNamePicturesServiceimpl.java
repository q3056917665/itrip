package com.example.service.Impl;

import com.example.dao.ItripCityNamePicturesMapper;
import com.example.model.ItripCityNamePictures;
import com.example.service.ItripCityNamePicturesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ItripCityNamePicturesServiceimpl implements ItripCityNamePicturesService {
    @Resource
    private ItripCityNamePicturesMapper itripCityNamePicturesMapper;

    @Override
    public List<ItripCityNamePictures> findAllByMouth(Integer mouthId) {
        return  itripCityNamePicturesMapper.selctAllByMouthId(mouthId);
    }

    @Override
    public List<ItripCityNamePictures> findAllByType(Integer typeId) {
        return itripCityNamePicturesMapper.selctAllByTypeId(typeId);
    }

    @Override
    public String getMouthId() {
        Date date=new Date();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM");
        String t=(String) df.format(date);
        String time=t.substring(5,7);
        return time;
    }
}

