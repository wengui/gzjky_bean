package com.gzjky.bean.extend;

import java.util.List;

/**
 * 高血压专项出力Bean
 * @author yuting
 *
 */
public class QueryMemberHtSpecialOutputBean {
	
	private String id;
	private String havaBloodDate;
	private String isUseMedicine;
	private String effect;
	private String sbp;
	private String dbp;
	private String BPLevel;
	private String RiskLevel;
	private List<TakeDrugsBean> medicineTakenItems;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHavaBloodDate() {
		return havaBloodDate;
	}
	public void setHavaBloodDate(String havaBloodDate) {
		this.havaBloodDate = havaBloodDate;
	}
	public String getIsUseMedicine() {
		return isUseMedicine;
	}
	public void setIsUseMedicine(String isUseMedicine) {
		this.isUseMedicine = isUseMedicine;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public String getSbp() {
		return sbp;
	}
	public void setSbp(String sbp) {
		this.sbp = sbp;
	}
	public String getDbp() {
		return dbp;
	}
	public void setDbp(String dbp) {
		this.dbp = dbp;
	}
	public String getBPLevel() {
		return BPLevel;
	}
	public void setBPLevel(String bPLevel) {
		BPLevel = bPLevel;
	}
	public String getRiskLevel() {
		return RiskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		RiskLevel = riskLevel;
	}
	public List<TakeDrugsBean> getMedicineTakenItems() {
		return medicineTakenItems;
	}
	public void setMedicineTakenItems(List<TakeDrugsBean> medicineTakenItems) {
		this.medicineTakenItems = medicineTakenItems;
	}

}
