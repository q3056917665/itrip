package com.example.model;

import java.io.Serializable;

public class ItripRouteOrder implements Serializable {
    private Long id;

    private Long routeid;

    private Double routeprice;

    private Long flightOrderId;

    private Double flightprice;

    private Long hotelOrderId;

    private Double hotelprice;

    private Double allprice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRouteid() {
        return routeid;
    }

    public void setRouteid(Long routeid) {
        this.routeid = routeid;
    }

    public Double getRouteprice() {
        return routeprice;
    }

    public void setRouteprice(Double routeprice) {
        this.routeprice = routeprice;
    }

    public Long getFlightOrderId() {
        return flightOrderId;
    }

    public void setFlightOrderId(Long flightOrderId) {
        this.flightOrderId = flightOrderId;
    }

    public Double getFlightprice() {
        return flightprice;
    }

    public void setFlightprice(Double flightprice) {
        this.flightprice = flightprice;
    }

    public Long getHotelOrderId() {
        return hotelOrderId;
    }

    public void setHotelOrderId(Long hotelOrderId) {
        this.hotelOrderId = hotelOrderId;
    }

    public Double getHotelprice() {
        return hotelprice;
    }

    public void setHotelprice(Double hotelprice) {
        this.hotelprice = hotelprice;
    }

    public Double getAllprice() {
        return allprice;
    }

    public void setAllprice(Double allprice) {
        this.allprice = allprice;
    }
}