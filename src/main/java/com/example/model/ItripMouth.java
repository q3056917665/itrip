package com.example.model;

import java.io.Serializable;

public class ItripMouth implements Serializable {
    private Integer id;

    private String mouthName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMouthName() {
        return mouthName;
    }

    public void setMouthName(String mouthName) {
        this.mouthName = mouthName == null ? null : mouthName.trim();
    }
}