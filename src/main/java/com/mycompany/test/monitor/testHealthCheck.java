package com.mycompany.test.monitor;

import com.codahale.metrics.health.HealthCheck;
import com.mycompany.test.resources.Products;

public class testHealthCheck extends HealthCheck {
    Products products;
    public testHealthCheck( Products products)
    {
        this.products=products;
    }
    @Override
     public Result check()
    {
        System.out.println("products.getUuid().get()"+ products.getUuid().get());
        if(products.getUuid().get() % 2==0)
            return Result.healthy();
        return Result.unhealthy("This must be a Odd Number so not Healthy");

    }
}
