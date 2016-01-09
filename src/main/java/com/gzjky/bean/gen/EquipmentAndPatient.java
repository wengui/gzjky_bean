package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class EquipmentAndPatient {
    private Integer id;

    private Integer equipmentid;

    private Integer patienttype;

    private Integer patientid;

    private String creator;

    private DateTime createdon;

    private String deleteor;

    private DateTime deleteon;

    private Boolean isdelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(Integer equipmentid) {
        this.equipmentid = equipmentid;
    }

    public Integer getPatienttype() {
        return patienttype;
    }

    public void setPatienttype(Integer patienttype) {
        this.patienttype = patienttype;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
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

    public String getDeleteor() {
        return deleteor;
    }

    public void setDeleteor(String deleteor) {
        this.deleteor = deleteor;
    }

    public DateTime getDeleteon() {
        return deleteon;
    }

    public void setDeleteon(DateTime deleteon) {
        this.deleteon = deleteon;
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }
}