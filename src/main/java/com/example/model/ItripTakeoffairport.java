package com.example.model;

public class ItripTakeoffairport {
    private Integer takeId;

    private String takeName;

    public Integer getTakeId() {
        return takeId;
    }

    public void setTakeId(Integer takeId) {
        this.takeId = takeId;
    }

    public String getTakeName() {
        return takeName;
    }

    public void setTakeName(String takeName) {
        this.takeName = takeName == null ? null : takeName.trim();
    }
}