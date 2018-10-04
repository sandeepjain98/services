package StepDefinations;

import com.mycompany.test.db.CouchBaseResource;
import com.mycompany.test.models.Product;
import com.mycompany.test.resources.Products;
import cucumber.api.DataTable;
import cucumber.api.java8.En;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


public class productGet implements En {
    public productGet() {
        CouchBaseResource couchBaseResource=mock(CouchBaseResource.class);
        Products products=new Products("gtin",couchBaseResource);
        final Product[] product = new Product[1];
        Given("^product Number is (\\d+) and someOne calls getProduct$", (Integer arg1) -> {
            product[0] = products.getProducts(     Optional.of(String.valueOf(arg1)));
        });

        Then("^product details should be as follows$", (DataTable arg1) -> {
        List<List<String>> list=    arg1.raw();
           assertEquals(product[0].getDescription(),list.get(1).get(0));
            assertEquals(product[0].getNumber(),list.get(1).get(2));
            assertEquals(product[0].getUuid(),list.get(1).get(1));

        });


    }
}
