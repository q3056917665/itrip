package com.example.model;

import java.io.Serializable;
import java.util.Date;

public class ItripHotelFeature implements Serializable {
    private Long id;

    private Long hotelid;

    private ItripHotel hotel;

    //标签字典表
    private ItripLabelDic dic;

    public ItripLabelDic getDic() { return dic; }

    public void setDic(ItripLabelDic dic) { this.dic = dic; }

    public ItripHotel getHotel() {
        return hotel;
    }

    public void setHotel(ItripHotel hotel) {
        this.hotel = hotel;
    }

    private Long featureid;

    private Date creationdate;

    private Long createdby;

    private Date modifydate;

    private Long modifiedby;

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

    public Long getFeatureid() {
        return featureid;
    }

    public void setFeatureid(Long featureid) {
        this.featureid = featureid;
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
}