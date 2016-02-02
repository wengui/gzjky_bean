package com.gzjky.bean.extend;

public class QueryBloodPressureOutputBean extends PageOutputBean{
	
	/**
	 * 血压历史ID
	 */
	public String id;
	
	/**
	 * 设备编号
	 */
	public String deviceSerialId;
	
	/**
	 * 设备类型
	 */
	public String deviceVersion;
	
	/**
	 * 测压时间
	 */
	public String takeTime;
	
	/**
	 * 收缩压
	 */
	public String shrink;
	
	/**
	 * 舒张压
	 */
	public String diastole;
	
	/**
	 * 脉率
	 */
	public String pressureValue;
	
	/**
	 * 心率
	 */
	public String heartRate;
	/**
	 * 状态
	 */
	public String state;
	
	/**
	 * 备注
	 */
	public String feedback;
	
	/**
	 * 设备昵称
	 */
	public String nickname;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDeviceSerialId() {
		return deviceSerialId;
	}

	public void setDeviceSerialId(String deviceSerialId) {
		this.deviceSerialId = deviceSerialId;
	}

	public String getDeviceVersion() {
		return deviceVersion;
	}

	public void setDeviceVersion(String deviceVersion) {
		this.deviceVersion = deviceVersion;
	}

	public String getTakeTime() {
		return takeTime;
	}

	public void setTakeTime(String takeTime) {
		this.takeTime = takeTime;
	}

	public String getShrink() {
		return shrink;
	}

	public void setShrink(String shrink) {
		this.shrink = shrink;
	}

	public String getDiastole() {
		return diastole;
	}

	public void setDiastole(String diastole) {
		this.diastole = diastole;
	}

	public String getPressureValue() {
		return pressureValue;
	}

	public void setPressureValue(String pressureValue) {
		this.pressureValue = pressureValue;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(String heartRate) {
		this.heartRate = heartRate;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}
