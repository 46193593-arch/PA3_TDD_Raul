import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    @Test
    public void testAddProduct() {
        ProductService service = new ProductService();
        Product product = new Product("Laptop", 1500.0, "Electronics");

        service.addProduct(product);

        assertEquals(1, service.getAllProducts().size());
    }
}