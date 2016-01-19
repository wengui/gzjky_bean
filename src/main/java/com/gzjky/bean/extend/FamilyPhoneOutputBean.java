package com.gzjky.bean.extend;

public class FamilyPhoneOutputBean extends PageOutputBean{
	
	private String id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 手机号码
	 */
	private String cellphone;
	/**
	 * 亲属关系
	 */
	private String relationship;
	
	/**
	 * 固定电话
	 */
	private String phone;
	
	/**
	 * 单位
	 */
	private String company;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 家庭地址
	 */
	private String homeAddress;
	
	/**
	 * 报告
	 */
	private String report;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
}
