package com.gzjky.bean.extend;

/**
 * 心电查询参数Bean
 * @author yuting
 *
 */
public class ElectrocardioInputBean extends PageBean {

	/**
	 * 开始时间
	 */
	private String startDate;
	
	/**
	 * 结束时间
	 */
	private String endDate;
	
	/**
	 * 历史或者告警
	 */
	private String heartType;
	
	/**
	 * 患者ID
	 */
	private String patientId;

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getHeartType() {
		return heartType;
	}

	public void setHeartType(String heartType) {
		this.heartType = heartType;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
}
