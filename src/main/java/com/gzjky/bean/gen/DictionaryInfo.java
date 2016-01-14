package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class DictionaryInfo {
    private Integer id;

    private String dictionarycode;

    private String dictionname;

    private String parentcode;

    private String version;

    private String remark;

    private DateTime createdon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDictionarycode() {
        return dictionarycode;
    }

    public void setDictionarycode(String dictionarycode) {
        this.dictionarycode = dictionarycode;
    }

    public String getDictionname() {
        return dictionname;
    }

    public void setDictionname(String dictionname) {
        this.dictionname = dictionname;
    }

    public String getParentcode() {
        return parentcode;
    }

    public void setParentcode(String parentcode) {
        this.parentcode = parentcode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public DateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(DateTime createdon) {
        this.createdon = createdon;
    }
}