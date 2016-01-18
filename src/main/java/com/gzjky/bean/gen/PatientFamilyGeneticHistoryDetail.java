package com.gzjky.bean.gen;

public class PatientFamilyGeneticHistoryDetail {
    private Integer id;

    private Integer patientid;

    private String relationship;

    private String sickyear;

    private String diaseasename;

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

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getSickyear() {
        return sickyear;
    }

    public void setSickyear(String sickyear) {
        this.sickyear = sickyear;
    }

    public String getDiaseasename() {
        return diaseasename;
    }

    public void setDiaseasename(String diaseasename) {
        this.diaseasename = diaseasename;
    }
}