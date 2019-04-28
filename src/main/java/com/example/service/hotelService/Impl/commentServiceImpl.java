package com.example.service.hotelService.Impl;

import com.example.dao.ItripCommentMapper;
import com.example.service.hotelService.commentService;
import com.example.model.ItripComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class commentServiceImpl implements commentService {

    @Autowired
    private ItripCommentMapper dao;
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
        return dao.selectAllCommentByHotelId(id);
    }


}
