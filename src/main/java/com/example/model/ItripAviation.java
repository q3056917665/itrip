package com.example.model;

public class ItripAviation {
    private Integer aviationId;

    private String aviationName;

    public Integer getAviationId() {
        return aviationId;
    }

    public void setAviationId(Integer aviationId) {
        this.aviationId = aviationId;
    }

    public String getAviationName() {
        return aviationName;
    }

    public void setAviationName(String aviationName) {
        this.aviationName = aviationName == null ? null : aviationName.trim();
    }
}