package com.example.controller.routeController;

import com.example.model.ItripRoute;
import com.example.model.ItripRouteSpot;
import com.example.service.routeService.RouteSpotService;
import com.example.service.routeService.routeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class routeController {

    @Resource
    private routeService routeService;
    @Resource
    private RouteSpotService routeSpotService;

    @RequestMapping(value = "travelindex")
    public String travelindex(HttpSession session) {
        List<ItripRoute> itripRoutes=routeService.findAll();
        List<ItripRoute> guo=new ArrayList<>();
        List<ItripRoute> wai=new ArrayList<>();
        int a=0,b=0;
        for (ItripRoute route:itripRoutes) {
            if (route.getTypeid()==2){
                a++;
                guo.add(route);
                if (a==6){
                    break;
                }
            }
        }
        for (ItripRoute route:itripRoutes) {
            if (route.getTypeid()==1){
                b++;
                wai.add(route);
                if (b==6){
                    break;
                }
            }
        }
        session.setAttribute("guo",guo);
        session.setAttribute("wai",wai);
        return "travel/index";
    }

    @RequestMapping(value = "travelmessage")
    public String travelmessage(Long id, Model model){
        ItripRoute itripRoute=routeService.findById(id);
        List<ItripRouteSpot> routeSpots=routeSpotService.findByRouteId(id);
        model.addAttribute("travelmessage",itripRoute);
        model.addAttribute("routeSpots",routeSpots);
        return "travel/travel_message";
    }

}
