package com.gzjky.bean.extend;

public class TerminalInfoBean {

	// 号码1
	private String sim1;
	// 号码2
	private String sim2;
	private String sim3;
	// 定时上传设置时间周期
	private String send_data_interval;
	// 心率报警上限值
	private String heartrate_alert_threshold_top;
	// 心率报警下限值
	private String heartrate_alert_threshold_bottom;
	// 收缩压上限值
	private String blood_pressure_alert_shrink_threshold_top;
	// 收缩压下限值
	private String blood_pressure_alert_shrink_threshold_bottom;
	// 舒张压上限值
	private String blood_pressure_alert_diastole_threshold_top;
	// 舒张压下限值
	private String blood_pressure_alert_diastole_threshold_bottom;

	public String getSim1() {
		return sim1;
	}

	public void setSim1(String sim1) {
		this.sim1 = sim1;
	}

	public String getSim2() {
		return sim2;
	}

	public void setSim2(String sim2) {
		this.sim2 = sim2;
	}

	public String getSim3() {
		return sim3;
	}

	public void setSim3(String sim3) {
		this.sim3 = sim3;
	}

	public String getSend_data_interval() {
		return send_data_interval;
	}

	public void setSend_data_interval(String send_data_interval) {
		this.send_data_interval = send_data_interval;
	}

	public String getHeartrate_alert_threshold_top() {
		return heartrate_alert_threshold_top;
	}

	public void setHeartrate_alert_threshold_top(String heartrate_alert_threshold_top) {
		this.heartrate_alert_threshold_top = heartrate_alert_threshold_top;
	}

	public String getHeartrate_alert_threshold_bottom() {
		return heartrate_alert_threshold_bottom;
	}

	public void setHeartrate_alert_threshold_bottom(String heartrate_alert_threshold_bottom) {
		this.heartrate_alert_threshold_bottom = heartrate_alert_threshold_bottom;
	}

	public String getBlood_pressure_alert_shrink_threshold_top() {
		return blood_pressure_alert_shrink_threshold_top;
	}

	public void setBlood_pressure_alert_shrink_threshold_top(String blood_pressure_alert_shrink_threshold_top) {
		this.blood_pressure_alert_shrink_threshold_top = blood_pressure_alert_shrink_threshold_top;
	}

	public String getBlood_pressure_alert_shrink_threshold_bottom() {
		return blood_pressure_alert_shrink_threshold_bottom;
	}

	public void setBlood_pressure_alert_shrink_threshold_bottom(String blood_pressure_alert_shrink_threshold_bottom) {
		this.blood_pressure_alert_shrink_threshold_bottom = blood_pressure_alert_shrink_threshold_bottom;
	}

	public String getBlood_pressure_alert_diastole_threshold_top() {
		return blood_pressure_alert_diastole_threshold_top;
	}

	public void setBlood_pressure_alert_diastole_threshold_top(String blood_pressure_alert_diastole_threshold_top) {
		this.blood_pressure_alert_diastole_threshold_top = blood_pressure_alert_diastole_threshold_top;
	}

	public String getBlood_pressure_alert_diastole_threshold_bottom() {
		return blood_pressure_alert_diastole_threshold_bottom;
	}

	public void setBlood_pressure_alert_diastole_threshold_bottom(
			String blood_pressure_alert_diastole_threshold_bottom) {
		this.blood_pressure_alert_diastole_threshold_bottom = blood_pressure_alert_diastole_threshold_bottom;
	}


}
