package com.gzjky.bean.extend;

/**
 * 疾病史出力bean
 * @author yuting
 *
 */
public class PatientDiseaseHistoryOutputBean extends PageOutputBean{
	
	/**
	 * 疾病名
	 */
	private String diseaseName;
	
	/**
	 * 疾病开始时间
	 */
	private String startTime;
	
	/**
	 * 疾病结束时间
	 */
	private String endTime;
	
	/**
	 * 住院情况
	 */
	private String hospitalRecord;
	
	/**
	 * 转归情况
	 */
	private String recoverRecord;
	
	/**
	 * 备注
	 */
	private String comment;
	
	/**
	 * 
	 */
	private String diseaseCode;

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getHospitalRecord() {
		return hospitalRecord;
	}

	public void setHospitalRecord(String hospitalRecord) {
		this.hospitalRecord = hospitalRecord;
	}

	public String getRecoverRecord() {
		return recoverRecord;
	}

	public void setRecoverRecord(String recoverRecord) {
		this.recoverRecord = recoverRecord;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDiseaseCode() {
		return diseaseCode;
	}

	public void setDiseaseCode(String diseaseCode) {
		this.diseaseCode = diseaseCode;
	}

}
