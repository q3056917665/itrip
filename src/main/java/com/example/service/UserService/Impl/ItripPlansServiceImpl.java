package com.example.service.UserService.Impl;

import com.example.dao.ItripPlansMapper;
import com.example.model.HotelView;
import com.example.model.ItripPlans;
import com.example.service.UserService.ItripPlansService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class ItripPlansServiceImpl implements ItripPlansService {
    @Resource
    private ItripPlansMapper itripPlansMapper;
    @Override
    public List<ItripPlans> findAllByChina(String address) {
        return itripPlansMapper.selectAllByChina(address);
    }

    @Override
    public List<ItripPlans> findAllByWai(String address) {
        return itripPlansMapper.selectAllByWai(address);
    }

    @Override
    public List<ItripPlans> randomByChina(List<ItripPlans> list) {
        List<Integer> count=new ArrayList<>();
        List<ItripPlans> byChina=new ArrayList<>();
        for (int i=0;i<list.size()&&i<6;i++){
            int ran=(int)(Math.random()*list.size());
            if(!count.contains(ran)){
                count.add(ran);
                byChina.add(list.get(ran));
            }else{
                i--;
            }
        }
        return byChina;
    }

    @Override
    public List<ItripPlans> randomByWai(List<ItripPlans> list) {
        List<Integer> count=new ArrayList<>();
        List<ItripPlans> byWai=new ArrayList<>();
        for (int i=0;i<list.size()&&i<6;i++){
            int ran=(int)(Math.random()*list.size());
            if(!count.contains(ran)){
                count.add(ran);
                byWai.add(list.get(ran));
            }else{
                i--;
            }
        }
        return byWai;
    }
}
