// validación de producto
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        };
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
