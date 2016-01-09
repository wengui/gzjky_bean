package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class FunctionalOrganization {
    private Integer id;

    private String orgnum;

    private String orgname;

    private String orgarea;

    private String orgcontactpeople;

    private String orgphone;

    private String orgemail;

    private String orgaddress;

    private DateTime createdon;

    private Integer parentid;

    private String orginfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrgnum() {
        return orgnum;
    }

    public void setOrgnum(String orgnum) {
        this.orgnum = orgnum;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getOrgarea() {
        return orgarea;
    }

    public void setOrgarea(String orgarea) {
        this.orgarea = orgarea;
    }

    public String getOrgcontactpeople() {
        return orgcontactpeople;
    }

    public void setOrgcontactpeople(String orgcontactpeople) {
        this.orgcontactpeople = orgcontactpeople;
    }

    public String getOrgphone() {
        return orgphone;
    }

    public void setOrgphone(String orgphone) {
        this.orgphone = orgphone;
    }

    public String getOrgemail() {
        return orgemail;
    }

    public void setOrgemail(String orgemail) {
        this.orgemail = orgemail;
    }

    public String getOrgaddress() {
        return orgaddress;
    }

    public void setOrgaddress(String orgaddress) {
        this.orgaddress = orgaddress;
    }

    public DateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(DateTime createdon) {
        this.createdon = createdon;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getOrginfo() {
        return orginfo;
    }

    public void setOrginfo(String orginfo) {
        this.orginfo = orginfo;
    }
}