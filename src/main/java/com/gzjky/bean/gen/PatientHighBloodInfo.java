package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class PatientHighBloodInfo {
    private Integer id;

    private Integer patientid;

    private DateTime havehighbloodtime;

    private String isdrug;

    private Integer highestsystolicpressure;

    private Integer highestdiastolicpressure;

    private String bloodpressurelevel;

    private String risklevel;

    private String efficacy;

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

    public DateTime getHavehighbloodtime() {
        return havehighbloodtime;
    }

    public void setHavehighbloodtime(DateTime havehighbloodtime) {
        this.havehighbloodtime = havehighbloodtime;
    }

    public String getIsdrug() {
        return isdrug;
    }

    public void setIsdrug(String isdrug) {
        this.isdrug = isdrug;
    }

    public Integer getHighestsystolicpressure() {
        return highestsystolicpressure;
    }

    public void setHighestsystolicpressure(Integer highestsystolicpressure) {
        this.highestsystolicpressure = highestsystolicpressure;
    }

    public Integer getHighestdiastolicpressure() {
        return highestdiastolicpressure;
    }

    public void setHighestdiastolicpressure(Integer highestdiastolicpressure) {
        this.highestdiastolicpressure = highestdiastolicpressure;
    }

    public String getBloodpressurelevel() {
        return bloodpressurelevel;
    }

    public void setBloodpressurelevel(String bloodpressurelevel) {
        this.bloodpressurelevel = bloodpressurelevel;
    }

    public String getRisklevel() {
        return risklevel;
    }

    public void setRisklevel(String risklevel) {
        this.risklevel = risklevel;
    }

    public String getEfficacy() {
        return efficacy;
    }

    public void setEfficacy(String efficacy) {
        this.efficacy = efficacy;
    }
}