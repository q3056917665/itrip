package com.example.model;

import java.util.Date;

public class ItripPlans {
    private ItripAviation itripAviation;

    private ItripTypeji itripTypeji;

    private ItripShippingspace itripShippingspace;

    public ItripAviation getItripAviation() {
        return itripAviation;
    }

    public void setItripAviation(ItripAviation itripAviation) {
        this.itripAviation = itripAviation;
    }

    public ItripTypeji getItripTypeji() {
        return itripTypeji;
    }

    public void setItripTypeji(ItripTypeji itripTypeji) {
        this.itripTypeji = itripTypeji;
    }

    public ItripShippingspace getItripShippingspace() {
        return itripShippingspace;
    }

    public void setItripShippingspace(ItripShippingspace itripShippingspace) {
        this.itripShippingspace = itripShippingspace;
    }

    private Integer planId;

    private String planName;

    private Date planOut;

    private Date planArrive;

    private String planAddress;

    private String planDestination;

    private String planPunctualityrate;

    private Integer aviationId;

    private Integer typeId;

    private Integer shippingId;

    private Integer takeId;

    private Integer hctypeId;

    private Integer chainaorwaiCountry;

    public Integer getChainaorwaiCountry() {
        return chainaorwaiCountry;
    }

    public void setChainaorwaiCountry(Integer chainaorwaiCountry) {
        this.chainaorwaiCountry = chainaorwaiCountry;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName == null ? null : planName.trim();
    }

    public Date getPlanOut() {
        return planOut;
    }

    public void setPlanOut(Date planOut) {
        this.planOut = planOut;
    }

    public Date getPlanArrive() {
        return planArrive;
    }

    public void setPlanArrive(Date planArrive) {
        this.planArrive = planArrive;
    }

    public String getPlanAddress() {
        return planAddress;
    }

    public void setPlanAddress(String planAddress) {
        this.planAddress = planAddress == null ? null : planAddress.trim();
    }

    public String getPlanDestination() {
        return planDestination;
    }

    public void setPlanDestination(String planDestination) {
        this.planDestination = planDestination == null ? null : planDestination.trim();
    }

    public String getPlanPunctualityrate() {
        return planPunctualityrate;
    }

    public void setPlanPunctualityrate(String planPunctualityrate) {
        this.planPunctualityrate = planPunctualityrate == null ? null : planPunctualityrate.trim();
    }

    public Integer getAviationId() {
        return aviationId;
    }

    public void setAviationId(Integer aviationId) {
        this.aviationId = aviationId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getShippingId() {
        return shippingId;
    }

    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    public Integer getTakeId() {
        return takeId;
    }

    public void setTakeId(Integer takeId) {
        this.takeId = takeId;
    }

    public Integer getHctypeId() {
        return hctypeId;
    }

    public void setHctypeId(Integer hctypeId) {
        this.hctypeId = hctypeId;
    }
}