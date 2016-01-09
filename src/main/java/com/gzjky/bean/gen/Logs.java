package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class Logs {
    private Integer id;

    private String level;

    private String logger;

    private String message;

    private String exception;

    private DateTime logtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLogger() {
        return logger;
    }

    public void setLogger(String logger) {
        this.logger = logger;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public DateTime getLogtime() {
        return logtime;
    }

    public void setLogtime(DateTime logtime) {
        this.logtime = logtime;
    }
}