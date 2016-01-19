package com.gzjky.bean.extend;

public class MemberConsultationOutputBean extends PageOutputBean {

	private String id;
	private String symptom;
	private String content;
	private String createTime;
	private String report;
	private String reportCreateTime;
	private String state;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSymptom() {
		return symptom;
	}
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public String getReportCreateTime() {
		return reportCreateTime;
	}
	public void setReportCreateTime(String reportCreateTime) {
		this.reportCreateTime = reportCreateTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
