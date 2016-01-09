package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class DoctorAdviceHistory {
    private Integer id;

    private Integer patientid;

    private String systolicpressure;

    private String diastolicpressure;

    private String trackperiod;

    private String frequency;

    private DateTime startdate;

    private Integer medicineid;

    private String remark;

    private String healthadvice;

    private Integer state;

    private String historyreport;

    private DateTime createdon;

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

    public String getSystolicpressure() {
        return systolicpressure;
    }

    public void setSystolicpressure(String systolicpressure) {
        this.systolicpressure = systolicpressure;
    }

    public String getDiastolicpressure() {
        return diastolicpressure;
    }

    public void setDiastolicpressure(String diastolicpressure) {
        this.diastolicpressure = diastolicpressure;
    }

    public String getTrackperiod() {
        return trackperiod;
    }

    public void setTrackperiod(String trackperiod) {
        this.trackperiod = trackperiod;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public DateTime getStartdate() {
        return startdate;
    }

    public void setStartdate(DateTime startdate) {
        this.startdate = startdate;
    }

    public Integer getMedicineid() {
        return medicineid;
    }

    public void setMedicineid(Integer medicineid) {
        this.medicineid = medicineid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHealthadvice() {
        return healthadvice;
    }

    public void setHealthadvice(String healthadvice) {
        this.healthadvice = healthadvice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getHistoryreport() {
        return historyreport;
    }

    public void setHistoryreport(String historyreport) {
        this.historyreport = historyreport;
    }

    public DateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(DateTime createdon) {
        this.createdon = createdon;
    }
}