package com.example.service.UserService.Impl;

import com.example.dao.HotelViewMapper;
import com.example.dao.ItripAreaDicMapper;
import com.example.model.HotelView;
import com.example.model.ItripAreaDic;
import com.example.service.UserService.ItripViewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class ItripViewServiceImpl implements ItripViewService {
    @Resource
    private HotelViewMapper hotelViewMapper;
    @Resource
    private ItripAreaDicMapper itripAreaDicMapper;

    @Override
    public List<HotelView> findAllByChinaAndCityId(Long cityId) {
        return hotelViewMapper.selectAllByChinaAndCityId(cityId);
    }

    @Override
    public List<HotelView> findAllByWaiAndCityId(Long cityId) {
        System.out.println("12312313132");
        return hotelViewMapper.selectAllByWaiAndCityId(cityId);
    }

    /***
     * 随机6个酒店信息
     * @param china
     * @return
     */
    @Override
    public List<HotelView> randomListByChina(List<HotelView> china) {
        List<Integer> count=new ArrayList<>();
        List<HotelView> byChina=new ArrayList<>();
        for (int i=0;i<china.size()&&i<6;i++){
             int ran=(int)(Math.random()*china.size());
             if(!count.contains(ran)){
                count.add(ran);
                byChina.add(china.get(ran));
             }else{
                 i--;
             }
        }
        return byChina;
    }

    @Override
    public List<HotelView> randomListByWai(List<HotelView> wai) {
        List<Integer> count=new ArrayList<>();
        List<HotelView> byWai=new ArrayList<>();
        for (int i=0;i<wai.size()&&i<6;i++){
            int ran=(int)(Math.random()*wai.size());
            if(!count.contains(ran)){
                count.add(ran);
                byWai.add(wai.get(ran));
            }else{
                i--; //重复就从从来
            }
        }
        return byWai;
    }
}
