package com.gzjky.bean.extend;

public class PatientDeviceInfoBean {
	
	
	//关系表ID
	private String epId;
	
	//设备别名
	private String nickname;
	//设备ID
	private String Id;
	//阈值表ID
	private String fId;
	//区域
	private String area;
	//设备序列号
	private String num;
	//设备型号
	private String version;

	//设备型号名字
	private String versionname;

	//收缩压上限值
	private String ssymax;
	//收缩压下限值
	private String ssymin;
	//舒张压上限值
	private String szymax;
	//舒张压下限值
	private String szymin;
	//SIM
	private String sim;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersionname() {
		return versionname;
	}

	public void setVersionname(String versionname) {
		this.versionname = versionname;
	}

	public String getSsymax() {
		return ssymax;
	}

	public void setSsymax(String ssymax) {
		this.ssymax = ssymax;
	}

	public String getSsymin() {
		return ssymin;
	}

	public void setSsymin(String ssymin) {
		this.ssymin = ssymin;
	}

	public String getSzymax() {
		return szymax;
	}

	public void setSzymax(String szymax) {
		this.szymax = szymax;
	}

	public String getSzymin() {
		return szymin;
	}

	public void setSzymin(String szymin) {
		this.szymin = szymin;
	}

	public String getEpId() {
		return epId;
	}

	public void setEpId(String epId) {
		this.epId = epId;
	}

	public String getfId() {
		return fId;
	}

	public void setfId(String fId) {
		this.fId = fId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	

}
