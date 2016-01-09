package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class Equipment {
    private Integer id;

    private Integer equipmentversion;

    private String equipmentnum;

    private String factorynum;

    private String area;

    private Integer partnersid;

    private String simnum;

    private String imsi;

    private String note;

    private Boolean issavefile;

    private String state;

    private String serviceallocationid;

    private Integer belonghospitalid;

    private DateTime createdon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEquipmentversion() {
        return equipmentversion;
    }

    public void setEquipmentversion(Integer equipmentversion) {
        this.equipmentversion = equipmentversion;
    }

    public String getEquipmentnum() {
        return equipmentnum;
    }

    public void setEquipmentnum(String equipmentnum) {
        this.equipmentnum = equipmentnum;
    }

    public String getFactorynum() {
        return factorynum;
    }

    public void setFactorynum(String factorynum) {
        this.factorynum = factorynum;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getPartnersid() {
        return partnersid;
    }

    public void setPartnersid(Integer partnersid) {
        this.partnersid = partnersid;
    }

    public String getSimnum() {
        return simnum;
    }

    public void setSimnum(String simnum) {
        this.simnum = simnum;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getIssavefile() {
        return issavefile;
    }

    public void setIssavefile(Boolean issavefile) {
        this.issavefile = issavefile;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getServiceallocationid() {
        return serviceallocationid;
    }

    public void setServiceallocationid(String serviceallocationid) {
        this.serviceallocationid = serviceallocationid;
    }

    public Integer getBelonghospitalid() {
        return belonghospitalid;
    }

    public void setBelonghospitalid(Integer belonghospitalid) {
        this.belonghospitalid = belonghospitalid;
    }

    public DateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(DateTime createdon) {
        this.createdon = createdon;
    }
}