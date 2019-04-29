package com.example.model;

import java.io.Serializable;

public class ItripRouteSpot implements Serializable {
    private Long id;

    private Long routeid;

    private Long spotid;

    private ItripSpot spot;

    public ItripSpot getSpot() {
        return spot;
    }

    public void setSpot(ItripSpot spot) {
        this.spot = spot;
    }

    private Long roomid;

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

    public Long getSpotid() {
        return spotid;
    }

    public void setSpotid(Long spotid) {
        this.spotid = spotid;
    }

    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }
}