package com.example.service.hotelService;

import com.example.model.ItripComment;

import java.util.List;

public interface commentService {

    int findCountByHotelId(long id);

    int findCounttjByHotel(long id);

    int findCountgsByHotel(long id);

    int findIsHavingImgCountByHotelId(long id);

    List<ItripComment> findAllCommentByHotelId(long id);
}
