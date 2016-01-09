package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class RegisteredUser {
    private Integer id;

    private String code;

    private String name;

    private Integer sex;

    private String birthday;

    private Integer cityid;

    private Integer bloodpressurecount;

    private Integer ecgdetectioncount;

    private String address;

    private String telephone;

    private Integer userid;

    private DateTime createdon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getBloodpressurecount() {
        return bloodpressurecount;
    }

    public void setBloodpressurecount(Integer bloodpressurecount) {
        this.bloodpressurecount = bloodpressurecount;
    }

    public Integer getEcgdetectioncount() {
        return ecgdetectioncount;
    }

    public void setEcgdetectioncount(Integer ecgdetectioncount) {
        this.ecgdetectioncount = ecgdetectioncount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public DateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(DateTime createdon) {
        this.createdon = createdon;
    }
}