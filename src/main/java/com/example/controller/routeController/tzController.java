package com.example.controller.routeController;

import com.example.model.ItripRoute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class tzController {
    @RequestMapping(value = "index")
    public String index() {
        return "index";
    }


    @RequestMapping(value = "tavernindex")
    public String tavernindex() {
        return "tavern/index";
    }

    @RequestMapping(value = "flyTicket")
    public String flyTicket() {
        return "flyTicket";
    }

    @RequestMapping(value = "strategyindex")
    public String strategyindex() {
        return "strategy/index";
    }
}
