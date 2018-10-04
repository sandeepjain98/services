package com.mycompany.test.resources;


import com.codahale.metrics.annotation.Timed;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.test.db.CouchBaseResource;
import com.mycompany.test.models.Product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
public class Products {
    private  String productType;
    private static final ObjectMapper mapper = new ObjectMapper();


    public AtomicLong getUuid() {
        return uuid;
    }

    private final AtomicLong uuid;
    private final CouchBaseResource couchBaseResource;
    public Products(String productType,CouchBaseResource couchBaseResource)
    {
        this.productType=productType;
        this.uuid=new AtomicLong();
        this.couchBaseResource = couchBaseResource;
    }

    @GET
    @Timed
    public Product getProducts(@QueryParam("number")Optional<String> number){
        long uuidRes=uuid.incrementAndGet();
        Product product= new Product(uuidRes+"", number.get(), "Product Description:"+uuidRes);
        try {
            couchBaseResource.set(String.valueOf(uuidRes),mapper.writeValueAsString(product));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return product;
    }
}
