package com.example.model;

import java.io.Serializable;

public class ItripStrategy implements Serializable {
    private Integer id;

    private Integer routeId;

    private String strategydata;

    private String strategydesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getStrategydata() {
        return strategydata;
    }

    public void setStrategydata(String strategydata) {
        this.strategydata = strategydata == null ? null : strategydata.trim();
    }

    public String getStrategydesc() {
        return strategydesc;
    }

    public void setStrategydesc(String strategydesc) {
        this.strategydesc = strategydesc == null ? null : strategydesc.trim();
    }
}