package com.example.dao;

import com.example.model.CommentAndView;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentAndViewMapper{
    List<CommentAndView> selectByMyComment(Long userId);

}
