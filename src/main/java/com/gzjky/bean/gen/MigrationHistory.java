package com.gzjky.bean.gen;

public class MigrationHistory {
    private String migrationid;

    private String contextkey;

    private String productversion;

    private byte[] model;

    public String getMigrationid() {
        return migrationid;
    }

    public void setMigrationid(String migrationid) {
        this.migrationid = migrationid;
    }

    public String getContextkey() {
        return contextkey;
    }

    public void setContextkey(String contextkey) {
        this.contextkey = contextkey;
    }

    public String getProductversion() {
        return productversion;
    }

    public void setProductversion(String productversion) {
        this.productversion = productversion;
    }

    public byte[] getModel() {
        return model;
    }

    public void setModel(byte[] model) {
        this.model = model;
    }
}