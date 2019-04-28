package com.example.model;

import java.util.Date;

public class ItripRouteFeature {
    private Long id;

    private Long routeid;

    private Long featureid;

    private Date creationdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRouteid() {
        return routeid;
    }

    public void setRouteid(Long routeid) {
        this.routeid = routeid;
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
}