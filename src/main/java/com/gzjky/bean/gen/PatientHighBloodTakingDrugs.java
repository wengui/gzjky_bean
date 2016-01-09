package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class PatientHighBloodTakingDrugs {
    private Integer id;

    private Integer patienthighbloodinfoid;

    private String drugsname;

    private String dose;

    private DateTime duration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPatienthighbloodinfoid() {
        return patienthighbloodinfoid;
    }

    public void setPatienthighbloodinfoid(Integer patienthighbloodinfoid) {
        this.patienthighbloodinfoid = patienthighbloodinfoid;
    }

    public String getDrugsname() {
        return drugsname;
    }

    public void setDrugsname(String drugsname) {
        this.drugsname = drugsname;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public DateTime getDuration() {
        return duration;
    }

    public void setDuration(DateTime duration) {
        this.duration = duration;
    }
}