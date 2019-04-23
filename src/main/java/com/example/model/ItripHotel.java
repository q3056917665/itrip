package com.example.model;

import java.util.Date;

public class ItripHotel {
    private Long id;

    private String hotelname;

    private Long countryid;

    private Long provinceid;

    private Long cityid;

    private String address;

    private Integer hoteltype;

    private Integer hotellevel;

    private Integer isgrouppurchase;

    private String redundantcityname;

    private String redundantprovincename;

    private String redundantcountryname;

    private Integer redundanthotelstore;

    private Date creationdate;

    private Long createdby;

    private Date modifydate;

    private Long modifiedby;

    private String details;

    private String facilities;

    private String hotelpolicy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname == null ? null : hotelname.trim();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getHoteltype() {
        return hoteltype;
    }

    public void setHoteltype(Integer hoteltype) {
        this.hoteltype = hoteltype;
    }

    public Integer getHotellevel() {
        return hotellevel;
    }

    public void setHotellevel(Integer hotellevel) {
        this.hotellevel = hotellevel;
    }

    public Integer getIsgrouppurchase() {
        return isgrouppurchase;
    }

    public void setIsgrouppurchase(Integer isgrouppurchase) {
        this.isgrouppurchase = isgrouppurchase;
    }

    public String getRedundantcityname() {
        return redundantcityname;
    }

    public void setRedundantcityname(String redundantcityname) {
        this.redundantcityname = redundantcityname == null ? null : redundantcityname.trim();
    }

    public String getRedundantprovincename() {
        return redundantprovincename;
    }

    public void setRedundantprovincename(String redundantprovincename) {
        this.redundantprovincename = redundantprovincename == null ? null : redundantprovincename.trim();
    }

    public String getRedundantcountryname() {
        return redundantcountryname;
    }

    public void setRedundantcountryname(String redundantcountryname) {
        this.redundantcountryname = redundantcountryname == null ? null : redundantcountryname.trim();
    }

    public Integer getRedundanthotelstore() {
        return redundanthotelstore;
    }

    public void setRedundanthotelstore(Integer redundanthotelstore) {
        this.redundanthotelstore = redundanthotelstore;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities == null ? null : facilities.trim();
    }

    public String getHotelpolicy() {
        return hotelpolicy;
    }

    public void setHotelpolicy(String hotelpolicy) {
        this.hotelpolicy = hotelpolicy == null ? null : hotelpolicy.trim();
    }
}