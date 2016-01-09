package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class PatientMedicine {
    private Integer id;

    private DateTime starttime;

    private String medicinename;

    private String dose;

    private String course;

    private String beforeafter;

    private String specifictime;

    private DateTime createdon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DateTime getStarttime() {
        return starttime;
    }

    public void setStarttime(DateTime starttime) {
        this.starttime = starttime;
    }

    public String getMedicinename() {
        return medicinename;
    }

    public void setMedicinename(String medicinename) {
        this.medicinename = medicinename;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBeforeafter() {
        return beforeafter;
    }

    public void setBeforeafter(String beforeafter) {
        this.beforeafter = beforeafter;
    }

    public String getSpecifictime() {
        return specifictime;
    }

    public void setSpecifictime(String specifictime) {
        this.specifictime = specifictime;
    }

    public DateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(DateTime createdon) {
        this.createdon = createdon;
    }
}