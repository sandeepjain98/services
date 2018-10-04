package com.mycompany.test.application;
import com.mycompany.test.Configuration;
import com.mycompany.test.db.CouchBaseResource;
import com.mycompany.test.db.CouchbaseConnection;
import com.mycompany.test.monitor.testHealthCheck;
import com.mycompany.test.resources.Products;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Application extends io.dropwizard.Application<Configuration> {

    public static void main(String[] args) throws Exception {
        new Application().run(args);
    }
    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
    }
    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {

        CouchbaseConnection connection =new CouchbaseConnection(configuration);

        Products products=new Products(configuration.getBaseProductType(),new CouchBaseResource(connection.getBucket()));
        environment.jersey().register(products);

        testHealthCheck testHealthCheck=new testHealthCheck(products);
        environment.healthChecks().register("testServiceHealth",testHealthCheck);

    }
}
