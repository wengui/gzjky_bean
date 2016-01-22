package com.gzjky.bean.extend;

import java.math.BigDecimal;

public class QueryDoctorReportOutputBean extends PageOutputBean{
	
    private Integer patientId;

    private String reportType;
    
    private Integer rpid;
    
    private String createdOn;
    
    private String starttime;

    private String endtime;

    private Integer goalOfSBP;

    private Integer goalOfDBP;

    private String bloodLevel;

    private String riskStratification;

    private String cardiovascularRiskFactors;

    private String targetOrgan;

    private String clinicalDisease;

    private Integer meanBloodPressureOfSBP;

    private Integer meanBloodPressureOfDBP;

    private BigDecimal sdMean;

    private Integer bloodPressureLoadOfSBP;

    private Integer bloodPressureLoadOfDBP;

    private Integer bloodPressureLoadOfMAP;

    private Integer bloodPressureLoadOfHR;

    private Integer MaxSBP;

    private String MaxSBPTime;

    private Integer MinSBP;

    private String MinSBPTime;

    private Integer MaxDBP;

    private String MaxDBPTime;

    private Integer MinDBP;

    private String MinDBPTime;

    private String completionStatus;

    private String noIndication;

    private String summary;

    private String healthAdvice;

    private String analysisResult;

    private String doctorHealthAdvice;

    private String IsSendMessage;

    private String doctorLoginName;

    private String reportResultcreatedOn;
    
    private String status;

    private String assessmentLevel;
    
    private String doctorSummary;
    
    private String doctorName;
    
    private String hospitalName;
    
    private String userStatus;

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public Integer getRpid() {
		return rpid;
	}

	public void setRpid(Integer rpid) {
		this.rpid = rpid;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public Integer getGoalOfSBP() {
		return goalOfSBP;
	}

	public void setGoalOfSBP(Integer goalOfSBP) {
		this.goalOfSBP = goalOfSBP;
	}

	public Integer getGoalOfDBP() {
		return goalOfDBP;
	}

	public void setGoalOfDBP(Integer goalOfDBP) {
		this.goalOfDBP = goalOfDBP;
	}

	public String getBloodLevel() {
		return bloodLevel;
	}

	public void setBloodLevel(String bloodLevel) {
		this.bloodLevel = bloodLevel;
	}

	public String getRiskStratification() {
		return riskStratification;
	}

	public void setRiskStratification(String riskStratification) {
		this.riskStratification = riskStratification;
	}

	public String getCardiovascularRiskFactors() {
		return cardiovascularRiskFactors;
	}

	public void setCardiovascularRiskFactors(String cardiovascularRiskFactors) {
		this.cardiovascularRiskFactors = cardiovascularRiskFactors;
	}

	public String getTargetOrgan() {
		return targetOrgan;
	}

	public void setTargetOrgan(String targetOrgan) {
		this.targetOrgan = targetOrgan;
	}

	public String getClinicalDisease() {
		return clinicalDisease;
	}

	public void setClinicalDisease(String clinicalDisease) {
		this.clinicalDisease = clinicalDisease;
	}

	public Integer getMeanBloodPressureOfSBP() {
		return meanBloodPressureOfSBP;
	}

	public void setMeanBloodPressureOfSBP(Integer meanBloodPressureOfSBP) {
		this.meanBloodPressureOfSBP = meanBloodPressureOfSBP;
	}

	public Integer getMeanBloodPressureOfDBP() {
		return meanBloodPressureOfDBP;
	}

	public void setMeanBloodPressureOfDBP(Integer meanBloodPressureOfDBP) {
		this.meanBloodPressureOfDBP = meanBloodPressureOfDBP;
	}

	public BigDecimal getSdMean() {
		return sdMean;
	}

	public void setSdMean(BigDecimal sdMean) {
		this.sdMean = sdMean;
	}

	public Integer getBloodPressureLoadOfSBP() {
		return bloodPressureLoadOfSBP;
	}

	public void setBloodPressureLoadOfSBP(Integer bloodPressureLoadOfSBP) {
		this.bloodPressureLoadOfSBP = bloodPressureLoadOfSBP;
	}

	public Integer getBloodPressureLoadOfDBP() {
		return bloodPressureLoadOfDBP;
	}

	public void setBloodPressureLoadOfDBP(Integer bloodPressureLoadOfDBP) {
		this.bloodPressureLoadOfDBP = bloodPressureLoadOfDBP;
	}

	public Integer getBloodPressureLoadOfMAP() {
		return bloodPressureLoadOfMAP;
	}

	public void setBloodPressureLoadOfMAP(Integer bloodPressureLoadOfMAP) {
		this.bloodPressureLoadOfMAP = bloodPressureLoadOfMAP;
	}

	public Integer getBloodPressureLoadOfHR() {
		return bloodPressureLoadOfHR;
	}

	public void setBloodPressureLoadOfHR(Integer bloodPressureLoadOfHR) {
		this.bloodPressureLoadOfHR = bloodPressureLoadOfHR;
	}

	public Integer getMaxSBP() {
		return MaxSBP;
	}

	public void setMaxSBP(Integer maxSBP) {
		MaxSBP = maxSBP;
	}

	public String getMaxSBPTime() {
		return MaxSBPTime;
	}

	public void setMaxSBPTime(String maxSBPTime) {
		MaxSBPTime = maxSBPTime;
	}

	public Integer getMinSBP() {
		return MinSBP;
	}

	public void setMinSBP(Integer minSBP) {
		MinSBP = minSBP;
	}

	public String getMinSBPTime() {
		return MinSBPTime;
	}

	public void setMinSBPTime(String minSBPTime) {
		MinSBPTime = minSBPTime;
	}

	public Integer getMaxDBP() {
		return MaxDBP;
	}

	public void setMaxDBP(Integer maxDBP) {
		MaxDBP = maxDBP;
	}

	public String getMaxDBPTime() {
		return MaxDBPTime;
	}

	public void setMaxDBPTime(String maxDBPTime) {
		MaxDBPTime = maxDBPTime;
	}

	public Integer getMinDBP() {
		return MinDBP;
	}

	public void setMinDBP(Integer minDBP) {
		MinDBP = minDBP;
	}

	public String getMinDBPTime() {
		return MinDBPTime;
	}

	public void setMinDBPTime(String minDBPTime) {
		MinDBPTime = minDBPTime;
	}

	public String getCompletionStatus() {
		return completionStatus;
	}

	public void setCompletionStatus(String completionStatus) {
		this.completionStatus = completionStatus;
	}

	public String getNoIndication() {
		return noIndication;
	}

	public void setNoIndication(String noIndication) {
		this.noIndication = noIndication;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getHealthAdvice() {
		return healthAdvice;
	}

	public void setHealthAdvice(String healthAdvice) {
		this.healthAdvice = healthAdvice;
	}

	public String getAnalysisResult() {
		return analysisResult;
	}

	public void setAnalysisResult(String analysisResult) {
		this.analysisResult = analysisResult;
	}

	public String getDoctorHealthAdvice() {
		return doctorHealthAdvice;
	}

	public void setDoctorHealthAdvice(String doctorHealthAdvice) {
		this.doctorHealthAdvice = doctorHealthAdvice;
	}

	public String getIsSendMessage() {
		return IsSendMessage;
	}

	public void setIsSendMessage(String isSendMessage) {
		IsSendMessage = isSendMessage;
	}

	public String getDoctorLoginName() {
		return doctorLoginName;
	}

	public void setDoctorLoginName(String doctorLoginName) {
		this.doctorLoginName = doctorLoginName;
	}

	public String getReportResultcreatedOn() {
		return reportResultcreatedOn;
	}

	public void setReportResultcreatedOn(String reportResultcreatedOn) {
		this.reportResultcreatedOn = reportResultcreatedOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAssessmentLevel() {
		return assessmentLevel;
	}

	public void setAssessmentLevel(String assessmentLevel) {
		this.assessmentLevel = assessmentLevel;
	}

	public String getDoctorSummary() {
		return doctorSummary;
	}

	public void setDoctorSummary(String doctorSummary) {
		this.doctorSummary = doctorSummary;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
}
