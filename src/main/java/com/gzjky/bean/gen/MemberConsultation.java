package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class MemberConsultation {
    private Integer id;

    private String symptom;

    private String consultingcontent;

    private String consultingtime;

    private String result;

    private String resulttime;

    private String state;

    private DateTime createdon;

    private DateTime savedon;

    private Boolean issendmessage;

    private String doctorloginname;

    private Integer patientid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getConsultingcontent() {
        return consultingcontent;
    }

    public void setConsultingcontent(String consultingcontent) {
        this.consultingcontent = consultingcontent;
    }

    public String getConsultingtime() {
        return consultingtime;
    }

    public void setConsultingtime(String consultingtime) {
        this.consultingtime = consultingtime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResulttime() {
        return resulttime;
    }

    public void setResulttime(String resulttime) {
        this.resulttime = resulttime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public DateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(DateTime createdon) {
        this.createdon = createdon;
    }

    public DateTime getSavedon() {
        return savedon;
    }

    public void setSavedon(DateTime savedon) {
        this.savedon = savedon;
    }

    public Boolean getIssendmessage() {
        return issendmessage;
    }

    public void setIssendmessage(Boolean issendmessage) {
        this.issendmessage = issendmessage;
    }

    public String getDoctorloginname() {
        return doctorloginname;
    }

    public void setDoctorloginname(String doctorloginname) {
        this.doctorloginname = doctorloginname;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }
}