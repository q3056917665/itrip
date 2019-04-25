package com.example.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ItripHotelOrder implements Serializable {
    private Long id;

    private Long userid;

    private Integer ordertype;

    private String orderno;

    private String tradeno;

    private Long hotelid;

    private String hotelname;

    private Long roomid;

    private Integer count;

    private Integer bookingdays;

    private Date checkindate;

    private Date checkoutdate;

    private Integer orderstatus;

    private BigDecimal payamount;

    private Integer paytype;

    private String noticephone;

    private String noticeemail;

    private Integer isneedinvoice;

    private Integer invoicetype;

    private String invoicehead;

    private String linkusername;

    private Integer booktype;

    private Date creationdate;

    private Long createdby;

    private Date modifydate;

    private Long modifiedby;

    private String specialrequirement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno == null ? null : tradeno.trim();
    }

    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname == null ? null : hotelname.trim();
    }

    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getBookingdays() {
        return bookingdays;
    }

    public void setBookingdays(Integer bookingdays) {
        this.bookingdays = bookingdays;
    }

    public Date getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(Date checkindate) {
        this.checkindate = checkindate;
    }

    public Date getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(Date checkoutdate) {
        this.checkoutdate = checkoutdate;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public BigDecimal getPayamount() {
        return payamount;
    }

    public void setPayamount(BigDecimal payamount) {
        this.payamount = payamount;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public String getNoticephone() {
        return noticephone;
    }

    public void setNoticephone(String noticephone) {
        this.noticephone = noticephone == null ? null : noticephone.trim();
    }

    public String getNoticeemail() {
        return noticeemail;
    }

    public void setNoticeemail(String noticeemail) {
        this.noticeemail = noticeemail == null ? null : noticeemail.trim();
    }

    public Integer getIsneedinvoice() {
        return isneedinvoice;
    }

    public void setIsneedinvoice(Integer isneedinvoice) {
        this.isneedinvoice = isneedinvoice;
    }

    public Integer getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(Integer invoicetype) {
        this.invoicetype = invoicetype;
    }

    public String getInvoicehead() {
        return invoicehead;
    }

    public void setInvoicehead(String invoicehead) {
        this.invoicehead = invoicehead == null ? null : invoicehead.trim();
    }

    public String getLinkusername() {
        return linkusername;
    }

    public void setLinkusername(String linkusername) {
        this.linkusername = linkusername == null ? null : linkusername.trim();
    }

    public Integer getBooktype() {
        return booktype;
    }

    public void setBooktype(Integer booktype) {
        this.booktype = booktype;
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

    public String getSpecialrequirement() {
        return specialrequirement;
    }

    public void setSpecialrequirement(String specialrequirement) {
        this.specialrequirement = specialrequirement == null ? null : specialrequirement.trim();
    }
}