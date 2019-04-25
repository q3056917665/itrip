package com.example.dao;

import com.example.model.ItripComment;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItripCommentMapper {

    //根据id查询酒店全部评价数量
    @Select(" select count(*) from itrip_comment where hotelId=#{id}")
    int selectAllCountByHotelId(@Param("id") long id);
    //根据id查询酒店值得推荐评价数量
    @Select(" select count(*) from itrip_comment where hotelId=#{id} and  isOk=1 ")
    int selecttjCountByHotelId(@Param("id") long id);
    //根据id查询酒店有待改善评价数量
    @Select(" select count(*) from itrip_comment where hotelId=#{id} and  isOk=0 ")
    int selectgsCountByHotelId(@Param("id") long id);
    //根据id查询酒店有图片评价数量
    @Select(" select count(*) from itrip_comment  where hotelId=#{id} and  isHavingImg=1 ")
    int selectIsHavingImgCountByHotelId(@Param("id") long id);
    //查询酒店所有评价
    @Select(" select * from itrip_comment  where hotelId=#{id} ")
    List<ItripComment> selectAllCommentByHotelId(@Param("id") long id);

    int deleteByPrimaryKey(Long id);

    int insert(ItripComment record);

    ItripComment selectByPrimaryKey(Long id);

    List<ItripComment> selectAll();

    int updateByPrimaryKey(ItripComment record);
}