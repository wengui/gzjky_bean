package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class ElectrocardioHistory {
    private Integer id;

    private Integer patientid;

    private Integer equipmentid;

    private String testingtime;

    private Integer heartrate;

    private Integer timelength;

    private String remark;

    private DateTime createdon;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public Integer getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(Integer equipmentid) {
        this.equipmentid = equipmentid;
    }

    public String getTestingtime() {
        return testingtime;
    }

    public void setTestingtime(String testingtime) {
        this.testingtime = testingtime;
    }

    public Integer getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(Integer heartrate) {
        this.heartrate = heartrate;
    }

    public Integer getTimelength() {
        return timelength;
    }

    public void setTimelength(Integer timelength) {
        this.timelength = timelength;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public DateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(DateTime createdon) {
        this.createdon = createdon;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}