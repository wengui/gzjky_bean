package com.gzjky.bean.extend;

/**
 * 疾病史查询入力bean
 * @author yuting
 *
 */
public class PatientDiseaseHistoryInputBean extends PageBean {

	/**
	 * 患者ID
	 */
	private String patientId;

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
}
