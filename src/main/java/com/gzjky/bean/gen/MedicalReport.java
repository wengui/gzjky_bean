package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class MedicalReport {
    private Integer id;

    private Integer patientid;

    private String aftype;

    private String reportfile1;

    private String reportfile2;

    private String reportfile3;

    private DateTime submittime;

    private DateTime createdon;

    private String submituser;

    private String diagnosticconclusion;

    private String diagnosticsuggestions;

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

    public String getAftype() {
        return aftype;
    }

    public void setAftype(String aftype) {
        this.aftype = aftype;
    }

    public String getReportfile1() {
        return reportfile1;
    }

    public void setReportfile1(String reportfile1) {
        this.reportfile1 = reportfile1;
    }

    public String getReportfile2() {
        return reportfile2;
    }

    public void setReportfile2(String reportfile2) {
        this.reportfile2 = reportfile2;
    }

    public String getReportfile3() {
        return reportfile3;
    }

    public void setReportfile3(String reportfile3) {
        this.reportfile3 = reportfile3;
    }

    public DateTime getSubmittime() {
        return submittime;
    }

    public void setSubmittime(DateTime submittime) {
        this.submittime = submittime;
    }

    public DateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(DateTime createdon) {
        this.createdon = createdon;
    }

    public String getSubmituser() {
        return submituser;
    }

    public void setSubmituser(String submituser) {
        this.submituser = submituser;
    }

    public String getDiagnosticconclusion() {
        return diagnosticconclusion;
    }

    public void setDiagnosticconclusion(String diagnosticconclusion) {
        this.diagnosticconclusion = diagnosticconclusion;
    }

    public String getDiagnosticsuggestions() {
        return diagnosticsuggestions;
    }

    public void setDiagnosticsuggestions(String diagnosticsuggestions) {
        this.diagnosticsuggestions = diagnosticsuggestions;
    }
}