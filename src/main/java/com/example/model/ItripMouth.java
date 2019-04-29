package com.example.model;

import java.io.Serializable;

public class ItripMouth implements Serializable {
    private Integer mouthId;

    private String mouthName;

    public Integer getMouthId() {
        return mouthId;
    }

    public void setMouthId(Integer mouthId) {
        this.mouthId = mouthId;
    }

    public String getMouthName() {
        return mouthName;
    }

    public void setMouthName(String mouthName) {
        this.mouthName = mouthName == null ? null : mouthName.trim();
    }
}