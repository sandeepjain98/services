package com.mycompany.test.db;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.document.JsonDocument;
import com.couchbase.client.java.document.json.JsonObject;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

    public class CouchBaseResource implements Database {
    private static final ObjectMapper mapper = new ObjectMapper();


    Bucket bucket;
    public CouchBaseResource(Bucket bucket)
    {
        this.bucket=bucket;
    }
    @Override
    public <T> T get(Class<T> clazz, String id) throws IOException {
       return mapper.readValue(bucket.get(id).content().toString(),clazz);
    }

    @Override
    public String set( String id, String object) {
        bucket.upsert(JsonDocument.create(id, JsonObject.fromJson(object)));
  return null;
    }

    }

