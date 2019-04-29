package com.example.service.hotelService;

import com.example.model.ItripComment;

import java.util.List;
import java.util.Map;

public interface commentService {


    Map<String,Double> findScore(long id);

    int findCountByHotelId(long id);

    int findCounttjByHotel(long id);

    int findCountgsByHotel(long id);

    int findIsHavingImgCountByHotelId(long id);

    List<ItripComment> findAllCommentByHotelId(long id);
}
