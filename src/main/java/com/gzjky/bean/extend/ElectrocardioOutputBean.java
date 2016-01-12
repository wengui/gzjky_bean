package com.gzjky.bean.extend;

public class ElectrocardioOutputBean extends PageOutputBean {

	/**
	 * 心电历史ID
	 */
	private String id;
	
	/**
	 * 设备编号
	 */
	private String deviceSerialId;
	
	/**
	 * 设备类型
	 */
	private String deviceVersion;
	
	/**
	 * 测压时间
	 */
	private String takeTime;
	
	/**
	 * 心率
	 */
	private String heartRate;
	
	/**
	 * 状态
	 */
	private String state;
	
	/**
	 * 时间长度
	 */
	private String timeLength;
	
	/**
	 * 备注
	 */
	private String feedback;

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

	public String getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(String heartRate) {
		this.heartRate = heartRate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTimeLength() {
		return timeLength;
	}

	public void setTimeLength(String timeLength) {
		this.timeLength = timeLength;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
}
