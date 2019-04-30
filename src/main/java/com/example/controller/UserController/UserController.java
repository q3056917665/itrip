package com.example.controller.UserController;

import com.example.model.*;
import com.example.service.UserService.*;
import com.example.service.hotelService.ItripAreaDicService;
import com.example.utils.PhoneUtils;
import com.example.utils.RegisterUtils;
import org.apache.http.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController{
    @Resource
    private ItripUserService itripUserService;
    @Resource
    private ImailService imailService;
    @Resource
    private ItripCityNamePicturesService itripCityNamePicturesService;
    @Resource
    private ItripMouthService itripMouthService;
    @Resource
    private ItripStrategyService itripStrategyService;
    @Resource
    private ItripViewService itripViewService;
    @Resource
    private ItripAreaDicService itripAreaDicService;

    /***
     * 跳转到注册页面
     * @return
     */
    @RequestMapping("/registerHtml")
    public String registerHtml() {
        return "user/register";
    }

    /***
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/loginHtml")
    public String loginHtml(){
        return "user/login";
    }

    /**
     * 跳转到旅游网首页
     * @return
     */
    @RequestMapping("/indexHtml")
    public String indexHtml(Model model,@RequestParam(value = "cityId",required = false)Long cityId){
        List<HotelView> bychina = itripViewService.findAllByChinaAndCityId(cityId); //查询全部国内酒店
        List<HotelView> bywai=itripViewService.findAllByWaiAndCityId(cityId); //查询全部国外酒店
        List<HotelView> allByChinaAndCityId = itripViewService.randomListByChina(bychina); //控制展示数量
        List<HotelView> allByWaiAndCityId=itripViewService.randomListByWai(bywai);//控制展示数量
        List<ItripAreaDic> hotCity = itripAreaDicService.findHotCity(); //查询国内酒店
        List<ItripAreaDic> seaCity = itripAreaDicService.findSeaCity(); //查询国外酒店
        model.addAttribute("allByChinaAndCityId",allByChinaAndCityId);
        model.addAttribute("allByWaiAndCityId",allByWaiAndCityId);
        model.addAttribute("hotCity",hotCity);
        model.addAttribute("seaCity",seaCity);
        return "index";
    }

    @RequestMapping("/seachChinaHotelByCityId")
    public String seachChinaHotelByCityId(Model model,
                                          @RequestParam(value = "cityId",required = false)Long cityId){
        System.out.println(cityId);
        List<HotelView> bychina = itripViewService.findAllByChinaAndCityId(cityId); //查询全部国内酒店
        List<HotelView> allByChinaAndCityId = itripViewService.randomListByChina(bychina); //控制展示数量
        List<ItripAreaDic> hotCity = itripAreaDicService.findHotCity(); //查询国内酒店
        model.addAttribute("allByChinaAndCityId",allByChinaAndCityId);
        model.addAttribute("hotCity",hotCity);
        return "index::guolei";
    }

    @RequestMapping("/seachWaiHotelByCityId")
    public String seachWaiHotelByCityId(Model model,
                                          @RequestParam(value = "cityId",required = false)Long cityId){
        System.out.println(cityId);
        List<HotelView> bywai=itripViewService.findAllByWaiAndCityId(cityId); //查询全部国外酒店
        for (int i=0;i<bywai.size();i++){
            System.out.println(bywai.get(i).getHotelname());
        }
        List<HotelView> allByWaiAndCityId=itripViewService.randomListByWai(bywai);//控制展示数量
        List<ItripAreaDic> seaCity = itripAreaDicService.findSeaCity(); //查询国外酒店
        model.addAttribute("allByWaiAndCityId",allByWaiAndCityId);
        model.addAttribute("seaCity",seaCity);
        return "index::guowai";
    }

    /**
     * 跳转到旅游网攻略首页
     * @return
     */
    @RequestMapping("/strategyHtml")
    public String strategyHtml(Model model){
        String time = itripCityNamePicturesService.getMouthId(); //获取系统当前月份
        Integer mouthId=Integer.parseInt(time);
        //根据月份id查询对应的推荐城市
        List<ItripCityNamePictures> allByMouth = itripCityNamePicturesService.findAllByMouth(mouthId);
        List<ItripMouth> mouthAll = itripMouthService.findMouthAll();
        List<ItripStrategyType> typeAll = itripStrategyService.findAll();
        Integer typeId=1; //类型默认是1
        List<ItripCityNamePictures> allByType = itripCityNamePicturesService.findAllByType(typeId);
        model.addAttribute("allByMouth",allByMouth);
        model.addAttribute("allByType",allByType);
        model.addAttribute("mouthAll",mouthAll);
        model.addAttribute("typeAll",typeAll);
        model.addAttribute("mouthId",mouthId);
        model.addAttribute("typeId",typeId);
        return "strategy/strategy_index";
    }

    /**
     * 跳转到旅游网攻略详情页面
     * @return
     */
    @RequestMapping("/methodDetailHtml")
    public String methodDetailHtml(){
        return "strategy/methodDetail";
    }

    /***
     * 手机号注册
     * @param session
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/registerByPhone")
    public String registerByPhone(HttpSession session, HttpServletRequest request) {
        String userPhone = request.getParameter("usercode"); //手机号
        String userPassword = request.getParameter("userPassword"); //密码
        if(userPhone==""||userPassword==""){
            return "00"; //手机或密码为null
        }else {
            boolean b = itripUserService.registerAllUser(userPhone, userPhone,1, userPassword);
            if (b) {
                return "1"; //注册成功
            } else {
                return "0"; //注册失败
            }
        }
    }

    /***
     * 邮箱注册
     * @param session
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/registerByEmail")
    public String registerUser(HttpSession session, HttpServletRequest request) {
        String userEmail = request.getParameter("usercode"); //邮箱
        String userPassword = request.getParameter("userPassword"); //密码
        if(userEmail==""||userPassword==""){
            return "00"; //邮箱或密码为null
        }else {
            boolean b = itripUserService.registerAllUser(userEmail, userEmail,1, userPassword);
            if (b) {
                return "1"; //注册成功
            } else {
                return "0"; //注册失败
            }
        }
    }

    /***
     * 发送邮件
     * @param session
     * @param request
     * @param userEmail
     * @return
     */
    @ResponseBody
    @RequestMapping("/getEmailUUID")
    public String getEmailUUID(HttpSession session, HttpServletRequest request,
                               @RequestParam(value = "usercode", required = false) String userEmail) {
        String uuid = RegisterUtils.getEmailUUID(); //获取状态码
        boolean bool = imailService.sendHtmlMail(userEmail, "主题:来自喻根全公司的激活邮件", "尊敬的用户:您的注册激活码是:" + uuid + "感谢使用本公司系统哦!");
        if (bool == true) {
            return uuid;
        } else {
            return null;
        }
    }

    @ResponseBody
    @RequestMapping("/getPhoneUUID")
    public String getPhoneUUID(HttpSession session,HttpServletRequest request,
                               @RequestParam(value = "usercode", required = false) String userPhone){
        Integer phone = RegisterUtils.getPhoneUUID();
        String phoneUUID=phone.toString();
        HttpResponse phoneUtils = PhoneUtils.getPhoneUtils(userPhone, phoneUUID);
        if(phoneUtils.toString()!=""){
            return phoneUUID;
        }else {
            return "";
        }
    }

    /****
     * 一个邮箱或者手机号只能注册一个用户
     * @param session
     * @param usercode
     * @return
     */
    @ResponseBody
    @RequestMapping("/AddFormByAjax")
    public boolean AddFormByAjax(HttpSession session,
                                 @RequestParam(value = "usercode", required = false) String usercode) {
        return itripUserService.findByUserCode(usercode);
    }


    @ResponseBody
    @RequestMapping("user/login")
    public String login(HttpServletRequest request,HttpSession session){
        String usercode = request.getParameter("usercode"); //邮箱
        String userPassword = request.getParameter("userPassword"); //密码
        if(usercode==""||userPassword==""){
            return "00";
        }else{
            ItripUser login = itripUserService.login(usercode, userPassword);
            if(login!=null){
                session.setAttribute("User",login);
                return "1";
            }else {
                return "0";
            }
        }
    }

    /***
     * 退出登录
     * @return
     */
    @RequestMapping("/exitlogin")
    public String exitOnLogin(HttpSession session) {
        session.invalidate(); //清除session
        return "redirect:loginHtml";
    }

    /****
     *
     * @param model
     * @param mouthId
     * @return
     */
    @RequestMapping("/seachByMouth")
    public String seachByMouth(Model model,@RequestParam(value = "mouthId",required = false)Integer mouthId){
         //根据月份id查询对应的推荐城市
         List<ItripCityNamePictures> allByMouth = itripCityNamePicturesService.findAllByMouth(mouthId);
         List<ItripMouth> mouthAll = itripMouthService.findMouthAll();
         System.out.println(mouthId);
         model.addAttribute("allByMouth",allByMouth);
         model.addAttribute("mouthAll",mouthAll);
         model.addAttribute("mouthId",mouthId);
         return "strategy/strategy_index::ByMouth";
    }

    /***
     *
     * @param model
     * @param typeId
     * @return
     */
    @RequestMapping("/seachByType")
    public String seachByType(Model model,@RequestParam(value = "stId",required = false)Integer typeId){
        //根据类型id查询对应的城市
        List<ItripCityNamePictures> allByType = itripCityNamePicturesService.findAllByType(typeId);
        List<ItripStrategyType> typeAll = itripStrategyService.findAll();
        model.addAttribute("allByType",allByType);
        model.addAttribute("typeAll",typeAll);
        model.addAttribute("typeId",typeId);
        return "strategy/strategy_index::ByType";
    }
}
