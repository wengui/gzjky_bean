package com.gzjky.bean.extend;

import java.util.List;

/**
 * 家族遗传史出力Bean
 * @author yuting
 *
 */
public class MemberFamilyDiseaseOutputBean {
	
	/**
	 * 家族遗传史有无
	 */
	public String have;
	
	/**
	 * 遗传病名称
	 */
	public String name;
	
	/**
	 * 家族关系
	 */
	public List<FamilyDiseaseRelationShips> familyDiseaseRelationShips;

	public String getHave() {
		return have;
	}

	public void setHave(String have) {
		this.have = have;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<FamilyDiseaseRelationShips> getFamilyDiseaseRelationShips() {
		return familyDiseaseRelationShips;
	}

	public void setFamilyDiseaseRelationShips(List<FamilyDiseaseRelationShips> familyDiseaseRelationShips) {
		this.familyDiseaseRelationShips = familyDiseaseRelationShips;
	}
	
}
