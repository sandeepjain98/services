package com.mycompany.test.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class Product {


    public Product(String uuid,String number,String description)
    {
        this.uuid=uuid;
        this.number=number;
        this.description=description;
    }

    @NotEmpty
    private String uuid;

    @NotEmpty
    private String number;

    @JsonProperty
    public String getUuid() {
        return uuid;
    }

    @JsonProperty
    public String getNumber() {
        return number;
    }

    @JsonProperty
    public String getDescription() {
        return description;
    }

    @NotEmpty
    private String description;
}
