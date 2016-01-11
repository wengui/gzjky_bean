package com.gzjky.bean.extend;

public class QueryBloodPressureOutputBean {
	
	/**
	 * 设备编号
	 */
	public String deviceSerialId;
	
	/**
	 * 设备类型
	 */
	public String device_version;
	
	/**
	 * 测压时间
	 */
	public String take_time;
	
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
	public String pressure_value;


	public String getDeviceSerialId() {
		return deviceSerialId;
	}

	public void setDeviceSerialId(String deviceSerialId) {
		this.deviceSerialId = deviceSerialId;
	}

	public String getDevice_version() {
		return device_version;
	}

	public void setDevice_version(String device_version) {
		this.device_version = device_version;
	}

	public String getTake_time() {
		return take_time;
	}

	public void setTake_time(String take_time) {
		this.take_time = take_time;
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

	public String getPressure_value() {
		return pressure_value;
	}

	public void setPressure_value(String pressure_value) {
		this.pressure_value = pressure_value;
	}

}
