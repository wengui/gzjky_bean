package com.gzjky.bean.extend;

public class FamilyPhoneOutputBean extends PageOutputBean{
	
	/**
	 * 姓名
	 */
	public String name;
	/**
	 * 手机号码
	 */
	public String cellphone;
	/**
	 * 亲属关系
	 */
	public String relationship;
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

}
