package com.mycompany.test.db;

import com.couchbase.client.java.document.json.JsonObject;

import java.io.IOException;

public interface Database {
   public <T> T get(Class<T> clazz,String id) throws IOException;
   public String set( String id, String object);

}
