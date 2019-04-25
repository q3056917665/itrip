package com.example.model;

import java.io.Serializable;

public class ItripHctype implements Serializable {
    private Integer hctypeId;

    private String hctypeName;

    public Integer getHctypeId() {
        return hctypeId;
    }

    public void setHctypeId(Integer hctypeId) {
        this.hctypeId = hctypeId;
    }

    public String getHctypeName() {
        return hctypeName;
    }

    public void setHctypeName(String hctypeName) {
        this.hctypeName = hctypeName == null ? null : hctypeName.trim();
    }
}