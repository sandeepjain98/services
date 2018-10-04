package com.mycompany.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mycompany.test.db.CouchBaseProperties;
import org.hibernate.validator.constraints.NotEmpty;

public class Configuration extends  io.dropwizard.Configuration {

    @NotEmpty
    private String baseProductType;

    @NotEmpty
    private String gtinProductType;

    @NotEmpty
    private String tempVariantProductType;

    @JsonProperty
    public String getBaseProductType() {
        return baseProductType;
    }

    @JsonProperty
    public void setBaseProductType(String baseProductType) {
        this.baseProductType = baseProductType;
    }

    @JsonProperty
    public String getGtinProductType() {
        return gtinProductType;
    }

    @JsonProperty
    public void setGtinProductType(String gtinProductType) {
        this.gtinProductType = gtinProductType;
    }

    @JsonProperty
    public String getTempVariantProductType() {
        return tempVariantProductType;
    }

    @JsonProperty
    public void setTempVariantProductType(String tempVariantProductType) {
        this.tempVariantProductType = tempVariantProductType;
    }

    public CouchBaseProperties getCouchBaseProperties() {
        return couchBaseProperties;
    }

    public void setCouchBaseProperties(CouchBaseProperties couchBaseProperties) {
        this.couchBaseProperties = couchBaseProperties;
    }

    @JsonProperty
    public CouchBaseProperties couchBaseProperties;

}