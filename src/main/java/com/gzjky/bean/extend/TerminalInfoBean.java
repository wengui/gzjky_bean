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
	// 用药提醒小时
	private String hour;
	// 用药提醒分钟
	private String minute;
	// 用药提醒提醒周期
	private String notice_interval;
	// 用药提醒提醒内容
	private String note;

	// 测压提醒开始时间
	private String start_time;
	// 测压提醒结束时间
	private String end_time;
	// 测压提醒提醒周期
	private String notice_intervals;

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

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getMinute() {
		return minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

	public String getNotice_interval() {
		return notice_interval;
	}

	public void setNotice_interval(String notice_interval) {
		this.notice_interval = notice_interval;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getNotice_intervals() {
		return notice_intervals;
	}

	public void setNotice_intervals(String notice_intervals) {
		this.notice_intervals = notice_intervals;
	}

}
