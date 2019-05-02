package com.example.service.UserService;

import com.example.model.ItripPlans;

import java.util.List;

public interface ItripPlansService {
    public List<ItripPlans> findAllByChina(String address);
    public List<ItripPlans> findAllByWai(String address);
    public List<ItripPlans> randomByChina(List<ItripPlans> list);
    public List<ItripPlans> randomByWai(List<ItripPlans> list);
}
