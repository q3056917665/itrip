package com.example.model;

public class ItripGuarantee {
    private Long id;

    private String name;

    private String pic;

    private Long routeid;

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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Long getRouteid() {
        return routeid;
    }

    public void setRouteid(Long routeid) {
        this.routeid = routeid;
    }
}