package com.example.service.UserService;

import com.example.model.CommentAndView;
import com.example.model.ItripHotelOrder;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CommentAndViewService {
    public PageInfo<CommentAndView> findAll(Long userId, Integer page, Integer pageSize);

}
