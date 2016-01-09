package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class ImportLog {
    private Integer id;

    private Integer importtype;

    private DateTime importtime;

    private String importfile;

    private String importmessage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImporttype() {
        return importtype;
    }

    public void setImporttype(Integer importtype) {
        this.importtype = importtype;
    }

    public DateTime getImporttime() {
        return importtime;
    }

    public void setImporttime(DateTime importtime) {
        this.importtime = importtime;
    }

    public String getImportfile() {
        return importfile;
    }

    public void setImportfile(String importfile) {
        this.importfile = importfile;
    }

    public String getImportmessage() {
        return importmessage;
    }

    public void setImportmessage(String importmessage) {
        this.importmessage = importmessage;
    }
}