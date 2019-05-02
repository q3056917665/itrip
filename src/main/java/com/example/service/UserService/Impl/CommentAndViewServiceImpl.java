package com.example.service.UserService.Impl;

import com.example.dao.CommentAndViewMapper;
import com.example.model.CommentAndView;
import com.example.model.ItripHotelOrder;
import com.example.service.UserService.CommentAndViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CommentAndViewServiceImpl implements CommentAndViewService {
    @Resource
    private CommentAndViewMapper commentAndViewMapper;

    @Override
    public PageInfo<CommentAndView> findAll(Long userId, Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List<CommentAndView> commentAndViews = commentAndViewMapper.selectByMyComment(userId);
        return new PageInfo<>(commentAndViews);
    }
}
