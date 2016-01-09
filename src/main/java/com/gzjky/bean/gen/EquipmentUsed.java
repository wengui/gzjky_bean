package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class EquipmentUsed {
    private Integer id;

    private Integer equipmentid;

    private Integer patientid;

    private String checktypecode;

    private String shousy;

    private String shuzy;

    private String xinlv;

    private DateTime checkdate;

    private DateTime createdon;

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

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public String getChecktypecode() {
        return checktypecode;
    }

    public void setChecktypecode(String checktypecode) {
        this.checktypecode = checktypecode;
    }

    public String getShousy() {
        return shousy;
    }

    public void setShousy(String shousy) {
        this.shousy = shousy;
    }

    public String getShuzy() {
        return shuzy;
    }

    public void setShuzy(String shuzy) {
        this.shuzy = shuzy;
    }

    public String getXinlv() {
        return xinlv;
    }

    public void setXinlv(String xinlv) {
        this.xinlv = xinlv;
    }

    public DateTime getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(DateTime checkdate) {
        this.checkdate = checkdate;
    }

    public DateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(DateTime createdon) {
        this.createdon = createdon;
    }
}