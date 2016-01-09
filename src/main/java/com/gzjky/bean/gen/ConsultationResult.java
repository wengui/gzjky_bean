package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class ConsultationResult {
    private Integer id;

    private Integer consultationid;

    private String result;

    private Integer doctorid;

    private DateTime createdon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConsultationid() {
        return consultationid;
    }

    public void setConsultationid(Integer consultationid) {
        this.consultationid = consultationid;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public DateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(DateTime createdon) {
        this.createdon = createdon;
    }
}