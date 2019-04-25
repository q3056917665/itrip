package com.example.model;

import java.io.Serializable;

public class ItripCityNamePictures implements Serializable {
    private Integer id;

    private String cityPictures;

    private String cityName;

    private Integer mouthId;

    private Integer typeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityPictures() {
        return cityPictures;
    }

    public void setCityPictures(String cityPictures) {
        this.cityPictures = cityPictures == null ? null : cityPictures.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getMouthId() {
        return mouthId;
    }

    public void setMouthId(Integer mouthId) {
        this.mouthId = mouthId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}