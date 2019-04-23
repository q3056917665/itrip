package com.example.model;

public class ItripMouth {
    private Integer id;

    private String monthName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName == null ? null : monthName.trim();
    }
}