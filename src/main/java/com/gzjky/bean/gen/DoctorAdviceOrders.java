package com.gzjky.bean.gen;

import org.joda.time.DateTime;

public class DoctorAdviceOrders {
    private Integer id;

    private Integer daid;

    private DateTime kssj;

    private String ywmc;

    private String jl;

    private String lc;

    private String fqfh;

    private String jtsj;

    private Boolean isdelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDaid() {
        return daid;
    }

    public void setDaid(Integer daid) {
        this.daid = daid;
    }

    public DateTime getKssj() {
        return kssj;
    }

    public void setKssj(DateTime kssj) {
        this.kssj = kssj;
    }

    public String getYwmc() {
        return ywmc;
    }

    public void setYwmc(String ywmc) {
        this.ywmc = ywmc;
    }

    public String getJl() {
        return jl;
    }

    public void setJl(String jl) {
        this.jl = jl;
    }

    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    public String getFqfh() {
        return fqfh;
    }

    public void setFqfh(String fqfh) {
        this.fqfh = fqfh;
    }

    public String getJtsj() {
        return jtsj;
    }

    public void setJtsj(String jtsj) {
        this.jtsj = jtsj;
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }
}