package com.example.model;

import java.io.Serializable;

public class ItripPeriphery implements Serializable {
    private Long id;

    private Integer currentId;

    private Integer peripheryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCurrentId() {
        return currentId;
    }

    public void setCurrentId(Integer currentId) {
        this.currentId = currentId;
    }

    public Integer getPeripheryId() {
        return peripheryId;
    }

    public void setPeripheryId(Integer peripheryId) {
        this.peripheryId = peripheryId;
    }
}