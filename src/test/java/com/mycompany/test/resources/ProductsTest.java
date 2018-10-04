package com.mycompany.test.resources;

import com.mycompany.test.db.CouchBaseResource;
import com.mycompany.test.models.Product;
import io.dropwizard.configuration.ConfigurationException;
import org.junit.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductsTest {
    private CouchBaseResource couchBaseResource=mock(CouchBaseResource.class);
    private Products products;

    @Before
    public void setup() throws URISyntaxException, IOException, ConfigurationException {
           products=new Products("gtin",couchBaseResource);

    }

    @Test
    public void checkProductResource()
    {
        System.out.println("product TEst");
        when(couchBaseResource.set(anyString(),anyString())).thenReturn(null);
        Optional<String> optional= Optional.of("1");
        Product prod = products.getProducts(optional);
        assertThat(prod.getDescription()).isEqualTo("Product Description:"+1);
        assertThat(prod.getNumber()).isEqualTo("1");
        assertThat(prod.getUuid()).isEqualTo("1");
    }

}
