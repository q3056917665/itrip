package com.example.service.hotelService.Impl;

import com.example.dao.ItripCommentMapper;
import com.example.model.ItripImage;
import com.example.service.hotelService.commentService;
import com.example.model.ItripComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class commentServiceImpl implements commentService {

    @Autowired
    private ItripCommentMapper dao;


    @Override
    public Map<String, Double> findScore(long id) {
        Map<String, Double> map=new HashMap<>();
        Double positionScore=dao.selectHotelpositionScore(id);
        Double facilitiesScore=dao.selectHotelfacilitiesScore(id);
        Double serviceScore=dao.selectHotelserviceScore(id);
        Double hygieneScore=dao.selectHotelhygieneScore(id);
        Double Scores=dao.selectHotelScores(id);
        positionScore=positionScore==null?0:positionScore;
        facilitiesScore=facilitiesScore==null?0:facilitiesScore;
        serviceScore=serviceScore==null?0:serviceScore;
        hygieneScore=hygieneScore==null?0:hygieneScore;
        Scores=Scores==null?0:Scores;
        map.put("positionScore",positionScore );
        map.put("facilitiesScore",facilitiesScore );
        map.put("serviceScore",serviceScore );
        map.put("hygieneScore",hygieneScore );
        map.put("Scores",Scores);
        return map;
    }



    @Override
    public int findCountByHotelId(long id) {
        return dao.selectAllCountByHotelId(id);
    }

    @Override
    public int findCounttjByHotel(long id) {
        return dao.selecttjCountByHotelId(id);
    }

    @Override
    public int findCountgsByHotel(long id) {
        return dao.selectgsCountByHotelId(id);
    }

    @Override
    public int findIsHavingImgCountByHotelId(long id) {
        return dao.selectIsHavingImgCountByHotelId(id);
    }

    //根据酒店id查询所有评价
    @Override
    public List<ItripComment> findAllCommentByHotelId(long id) {
        List<ItripComment> list=dao.selectAllCommentByHotelId(id);
        return list;
    }


}
