package com.gzjky.bean.extend;

public class QueryEcgRecordDetailOutputBean {

	/**
	 * 心率
	 */
	private String heartRate;
	/**
	 * 采集时间
	 */
	private String collectionTime;
	/**
	 * 分析时间
	 */
	private String uploadTime;
	/**
	 * 采集时长
	 */
	private String recordCount;
	/**
	 * 分析结果
	 */
	private String analyseResult;
	/**
	 * 保健建议
	 */
	private String suggestion;
	/**
	 * 诊断医师
	 */
	private String doctorName;
	/**
	 * 图片URL
	 */
	private String ecgImage;
	
	
	public String getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(String heartRate) {
		this.heartRate = heartRate;
	}
	public String getCollectionTime() {
		return collectionTime;
	}
	public void setCollectionTime(String collectionTime) {
		this.collectionTime = collectionTime;
	}
	public String getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}
	public String getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(String recordCount) {
		this.recordCount = recordCount;
	}
	public String getAnalyseResult() {
		return analyseResult;
	}
	public void setAnalyseResult(String analyseResult) {
		this.analyseResult = analyseResult;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getEcgImage() {
		return ecgImage;
	}
	public void setEcgImage(String ecgImage) {
		this.ecgImage = ecgImage;
	}
	
}
