// prueba del carrito
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    @Test
    public void testCartTotal() {
        Cart cart = new Cart();
        cart.addProduct(new Product("Book", 30.0, "Books"));

        assertEquals(30.0, cart.getTotal());
    }
}
