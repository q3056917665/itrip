package com.example.model;

import java.io.Serializable;

public class ItripMouth implements Serializable {
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