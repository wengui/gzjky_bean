package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class BloodPressureHistory {
    private Integer id;

    private Integer patientid;

    private Integer equipmentid;

    private String testingtime;

    private Integer systolicpressure;

    private Integer diastolicpressure;

    private Integer pulserate;

    private Integer heartrate;

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

    public Integer getSystolicpressure() {
        return systolicpressure;
    }

    public void setSystolicpressure(Integer systolicpressure) {
        this.systolicpressure = systolicpressure;
    }

    public Integer getDiastolicpressure() {
        return diastolicpressure;
    }

    public void setDiastolicpressure(Integer diastolicpressure) {
        this.diastolicpressure = diastolicpressure;
    }

    public Integer getPulserate() {
        return pulserate;
    }

    public void setPulserate(Integer pulserate) {
        this.pulserate = pulserate;
    }

    public Integer getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(Integer heartrate) {
        this.heartrate = heartrate;
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