package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class City {
    private Integer id;

    private String cityidstring;

    private DateTime createdon;

    private Integer provinceid;

    private Integer sort;

    private String cityname;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityidstring() {
        return cityidstring;
    }

    public void setCityidstring(String cityidstring) {
        this.cityidstring = cityidstring;
    }

    public DateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(DateTime createdon) {
        this.createdon = createdon;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}