package com.mycompany.test.db;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class CouchBaseProperties {

    @JsonProperty
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    @JsonProperty
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty
    public void setBucketname(String bucketname) {
        this.bucketname = bucketname;
    }

    @JsonProperty
    public String getCluster() {
        return cluster;
    }

    @JsonProperty
    public String getUsername() {
        return username;
    }

    @JsonProperty
    public String getPassword() {
        return password;
    }

    @JsonProperty
    public String getBucketname() {
        return bucketname;
    }

    @NotEmpty
    private String cluster;
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
    @NotEmpty
    private String bucketname;

}