package com.example.model;

import java.util.Date;

public class ItripComment {
    private Long id;

    private Long hotelid;

    private Long productid;

    private Long orderid;

    private Integer producttype;

    private Long userid;

    private Integer ishavingimg;

    private Integer positionscore;

    private Integer facilitiesscore;

    private Integer servicescore;

    private Integer hygienescore;

    private Integer score;

    private Long tripmode;

    private Integer isok;

    private Date creationdate;

    private Long createdby;

    private Date modifydate;

    private Long modifiedby;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Integer getProducttype() {
        return producttype;
    }

    public void setProducttype(Integer producttype) {
        this.producttype = producttype;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Integer getIshavingimg() {
        return ishavingimg;
    }

    public void setIshavingimg(Integer ishavingimg) {
        this.ishavingimg = ishavingimg;
    }

    public Integer getPositionscore() {
        return positionscore;
    }

    public void setPositionscore(Integer positionscore) {
        this.positionscore = positionscore;
    }

    public Integer getFacilitiesscore() {
        return facilitiesscore;
    }

    public void setFacilitiesscore(Integer facilitiesscore) {
        this.facilitiesscore = facilitiesscore;
    }

    public Integer getServicescore() {
        return servicescore;
    }

    public void setServicescore(Integer servicescore) {
        this.servicescore = servicescore;
    }

    public Integer getHygienescore() {
        return hygienescore;
    }

    public void setHygienescore(Integer hygienescore) {
        this.hygienescore = hygienescore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getTripmode() {
        return tripmode;
    }

    public void setTripmode(Long tripmode) {
        this.tripmode = tripmode;
    }

    public Integer getIsok() {
        return isok;
    }

    public void setIsok(Integer isok) {
        this.isok = isok;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Long getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}