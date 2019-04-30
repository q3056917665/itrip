package com.example.controller.hotelController;

import com.example.model.*;
import com.example.service.hotelService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class hotelController {



    @Autowired
    private ItripAreaDicService itripAreaDicService;//区域字典

    @Resource
   private HotelViewService hotelViewService;

    @Resource
    private ItripHotelService itripHotelService;//酒店service

    @Autowired
    private HotelFeatrueService hotelFeatrueService; //酒店特色
    @Autowired
    private commentService commentService; //酒店点评

    //跳转酒店页面
    @RequestMapping("/hotel")
    public String toHotel(HttpSession session,Model model){
        List<HotelView> hotels=hotelViewService.findHotel(3657);//默认显示洛杉矶
        List<ItripAreaDic> SeaCitys=itripAreaDicService.findSeaCity();
        session.setAttribute("Seahotels",hotels);
        session.setAttribute("SeaCitys",SeaCitys);
        //热门城市名
        List<ItripAreaDic> HotCitys= itripAreaDicService.findHotCity();
        model.addAttribute("HotCitys",HotCitys);
        List<HotelView> hotcityhotels=hotelViewService.findHotel(2);//默认显示北京市的酒店
        model.addAttribute("hotcityhotels",hotcityhotels);
        return "tavern/index";
    }

    // 点击不同城市查询海外酒店  thymeleaf 刷新
    @RequestMapping("/searchSeaHotel")
    public String searchSeaHotel(int id, HttpSession session){
        List<HotelView> hotels=hotelViewService.findHotel(id);
        session.setAttribute("Seahotels",hotels);
        return "tavern/index::myTabContent";
    }

    // 点击不同城市查询海外酒店  thymeleaf 刷新
    @RequestMapping("/searchHotCityHotel")
    public String searchSeaHotel(int id,Model model){
        List<HotelView> hotcityhotels=hotelViewService.findHotel(id);
        model.addAttribute("hotcityhotels",hotcityhotels);
        return "tavern/index::HotCitysHotel";
    }

    //点击图片跳转酒店详情
    @RequestMapping("/toHotelDetails")
    @ResponseBody
    public String tohotelDetails(int id,HttpSession session){
        ItripHotel hotel = itripHotelService.findById(id);
        session.setAttribute("hotel",hotel);
        List<ItripHotelFeature> hotelFeature = hotelFeatrueService.findHotelFeature(id);
        session.setAttribute("featrues",hotelFeature);
        session.setAttribute("commentCount",commentService.findCountByHotelId(id));//该酒店所有评价数量
        session.setAttribute("tjCommentCount",commentService.findCounttjByHotel(id));//该酒店值得推荐评价数量
        session.setAttribute("gsCommentCount",commentService.findCountgsByHotel(id));//该酒店有待改善评价数量
        session.setAttribute("isHavingImagComment",commentService.findIsHavingImgCountByHotelId(id));//该酒店是否有图片的评价数量
        session.setAttribute("AllComment",commentService.findAllCommentByHotelId(id)); //所有评价
        session.setAttribute("HotelScore",commentService.findScore(id)); //酒店评分
        return "success";
    }


    @RequestMapping("/HotelDetails")
    public String hotelDetails(){
        return "hotelDetail";
    }
}
