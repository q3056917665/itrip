package com.example.model;

import java.io.Serializable;
import java.util.Date;

public class ItripUserLinkUser implements Serializable {
    private Long id;

    private String linkusername;

    private String linkidcard;

    private String linkphone;

    private Integer userid;

    private Date creationdate;

    private Long createdby;

    private Date modifydate;

    private Long modifiedby;

    private Integer linkidcardtype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLinkusername() {
        return linkusername;
    }

    public void setLinkusername(String linkusername) {
        this.linkusername = linkusername == null ? null : linkusername.trim();
    }

    public String getLinkidcard() {
        return linkidcard;
    }

    public void setLinkidcard(String linkidcard) {
        this.linkidcard = linkidcard == null ? null : linkidcard.trim();
    }

    public String getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone == null ? null : linkphone.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public Integer getLinkidcardtype() {
        return linkidcardtype;
    }

    public void setLinkidcardtype(Integer linkidcardtype) {
        this.linkidcardtype = linkidcardtype;
    }
}