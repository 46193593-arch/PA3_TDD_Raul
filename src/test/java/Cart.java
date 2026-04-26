import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public double getTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}