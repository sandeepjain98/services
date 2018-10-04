package com.mycompany.test.db;

import com.mycompany.test.Configuration;
import com.couchbase.client.java.*;

public class CouchbaseConnection {

    public Bucket getBucket() {
        return bucket;
    }

    Bucket bucket;
    public CouchbaseConnection(Configuration configuration)
    {
        Cluster cluster = CouchbaseCluster.create(configuration.getCouchBaseProperties().getCluster());
        cluster.authenticate(configuration.getCouchBaseProperties().getUsername(), configuration.getCouchBaseProperties().getPassword());
        this.bucket = cluster.openBucket(configuration.getCouchBaseProperties().getBucketname());
    }



}
