package com.gzjky.bean.gen;

import java.util.Date;
import org.joda.time.DateTime;

public class BiochemicalHistory {
    private Integer id;

    private Integer patientid;

    private String samplenum;

    private String detecttype;

    private DateTime detecttime;

    private String detail;

    private Date createdon;

    private String area;

    private String operator;

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

    public String getSamplenum() {
        return samplenum;
    }

    public void setSamplenum(String samplenum) {
        this.samplenum = samplenum;
    }

    public String getDetecttype() {
        return detecttype;
    }

    public void setDetecttype(String detecttype) {
        this.detecttype = detecttype;
    }

    public DateTime getDetecttime() {
        return detecttime;
    }

    public void setDetecttime(DateTime detecttime) {
        this.detecttime = detecttime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}