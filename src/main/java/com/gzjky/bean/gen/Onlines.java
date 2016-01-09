package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class Onlines {
    private Integer id;

    private String ipadddress;

    private DateTime logintime;

    private DateTime updatetime;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIpadddress() {
        return ipadddress;
    }

    public void setIpadddress(String ipadddress) {
        this.ipadddress = ipadddress;
    }

    public DateTime getLogintime() {
        return logintime;
    }

    public void setLogintime(DateTime logintime) {
        this.logintime = logintime;
    }

    public DateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(DateTime updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}