package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class DoctorHospital {
    private Integer id;

    private Integer doctorid;

    private String doctorcode;

    private Integer hospitalid;

    private Integer departmentid;

    private Integer administrativeid;

    private Integer technologyid;

    private String joinworktime;

    private String visittime;

    private DateTime createdon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public String getDoctorcode() {
        return doctorcode;
    }

    public void setDoctorcode(String doctorcode) {
        this.doctorcode = doctorcode;
    }

    public Integer getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(Integer hospitalid) {
        this.hospitalid = hospitalid;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getAdministrativeid() {
        return administrativeid;
    }

    public void setAdministrativeid(Integer administrativeid) {
        this.administrativeid = administrativeid;
    }

    public Integer getTechnologyid() {
        return technologyid;
    }

    public void setTechnologyid(Integer technologyid) {
        this.technologyid = technologyid;
    }

    public String getJoinworktime() {
        return joinworktime;
    }

    public void setJoinworktime(String joinworktime) {
        this.joinworktime = joinworktime;
    }

    public String getVisittime() {
        return visittime;
    }

    public void setVisittime(String visittime) {
        this.visittime = visittime;
    }

    public DateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(DateTime createdon) {
        this.createdon = createdon;
    }
}