package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class Consultation {
    private Integer id;

    private Integer hospitalid;

    private Integer patientid;

    private DateTime startdate;

    private DateTime enddate;

    private Integer levelid;

    private String remark;

    private Integer statusid;

    private String creator;

    private DateTime createdon;

    private Integer approverid;

    private String patientaccount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(Integer hospitalid) {
        this.hospitalid = hospitalid;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public DateTime getStartdate() {
        return startdate;
    }

    public void setStartdate(DateTime startdate) {
        this.startdate = startdate;
    }

    public DateTime getEnddate() {
        return enddate;
    }

    public void setEnddate(DateTime enddate) {
        this.enddate = enddate;
    }

    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatusid() {
        return statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public DateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(DateTime createdon) {
        this.createdon = createdon;
    }

    public Integer getApproverid() {
        return approverid;
    }

    public void setApproverid(Integer approverid) {
        this.approverid = approverid;
    }

    public String getPatientaccount() {
        return patientaccount;
    }

    public void setPatientaccount(String patientaccount) {
        this.patientaccount = patientaccount;
    }
}