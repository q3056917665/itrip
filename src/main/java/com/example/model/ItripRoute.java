package com.example.model;

public class ItripRoute {
    private Long id;

    private String name;

    private String description;

    private String image;

    private Float price;

    private Long typeid;

    private String notice;

    private Integer day;

    private Long groupsid;

    private Long startaddress;

    private Long endaddress;

    private Long countryid;

    private Long provinceid;

    private Long cityid;

    private Long lineid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getTypeid() {
        return typeid;
    }

    public void setTypeid(Long typeid) {
        this.typeid = typeid;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Long getGroupsid() {
        return groupsid;
    }

    public void setGroupsid(Long groupsid) {
        this.groupsid = groupsid;
    }

    public Long getStartaddress() {
        return startaddress;
    }

    public void setStartaddress(Long startaddress) {
        this.startaddress = startaddress;
    }

    public Long getEndaddress() {
        return endaddress;
    }

    public void setEndaddress(Long endaddress) {
        this.endaddress = endaddress;
    }

    public Long getCountryid() {
        return countryid;
    }

    public void setCountryid(Long countryid) {
        this.countryid = countryid;
    }

    public Long getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Long provinceid) {
        this.provinceid = provinceid;
    }

    public Long getCityid() {
        return cityid;
    }

    public void setCityid(Long cityid) {
        this.cityid = cityid;
    }

    public Long getLineid() {
        return lineid;
    }

    public void setLineid(Long lineid) {
        this.lineid = lineid;
    }
}