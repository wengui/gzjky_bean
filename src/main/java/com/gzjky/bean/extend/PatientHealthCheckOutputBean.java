package com.gzjky.bean.extend;

public class PatientHealthCheckOutputBean extends PageOutputBean {

	/**
	 * id
	 */
    private String id;

    /**
	 * 患者ID
	 */
    private String patientid;

    /**
	 * 餐后血糖
	 */
    private String chxt;

    /**
	 * 空腹血糖
	 */
    private String kfqxxt;

    /**
	 * 总胆固醇
	 */
    private String zdgc;

    /**
	 * 高密度胆固醇	
	 */
    private String gmdzdbdgc;

    /**
	 * 低密度胆固醇	
	 */
    private String dmdzdbdgc;

    /**
	 * 血清肌酐
	 */
    private String xqjq;

    /**
	 * 微量尿白蛋白
	 */
    private String wlnbdb;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPatientid() {
		return patientid;
	}

	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}

	public String getChxt() {
		return chxt;
	}

	public void setChxt(String chxt) {
		this.chxt = chxt;
	}

	public String getKfqxxt() {
		return kfqxxt;
	}

	public void setKfqxxt(String kfqxxt) {
		this.kfqxxt = kfqxxt;
	}

	public String getZdgc() {
		return zdgc;
	}

	public void setZdgc(String zdgc) {
		this.zdgc = zdgc;
	}

	public String getGmdzdbdgc() {
		return gmdzdbdgc;
	}

	public void setGmdzdbdgc(String gmdzdbdgc) {
		this.gmdzdbdgc = gmdzdbdgc;
	}

	public String getDmdzdbdgc() {
		return dmdzdbdgc;
	}

	public void setDmdzdbdgc(String dmdzdbdgc) {
		this.dmdzdbdgc = dmdzdbdgc;
	}

	public String getXqjq() {
		return xqjq;
	}

	public void setXqjq(String xqjq) {
		this.xqjq = xqjq;
	}

	public String getWlnbdb() {
		return wlnbdb;
	}

	public void setWlnbdb(String wlnbdb) {
		this.wlnbdb = wlnbdb;
	}
}
