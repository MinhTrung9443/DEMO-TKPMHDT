package vn.iotstar.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import vn.iotstar.demo.Model.Cart;
import vn.iotstar.demo.Model.CartItem;


/**
 * 
 */
@Controller
public class CartController {
    private Cart cart;
	/**
     * Default constructor
     */
    public CartController() {
    }

    /**
     * @param quantity
     */
    public String addToCart(int productId, int quantity) {
        CartItem item = cart.addItem(productId, quantity);
        if (item != null) {
            return "Thêm sản phẩm thành công";
        }
        return "Thêm sản phẩm thất bại";
    }

    /**
     * 
     */
    public List<CartItem> viewCart() {
        List<CartItem> items = cart.getCartItems();
        if (items == null || items.isEmpty()) {
            return new ArrayList<>();
        }

        // Loop for each cartItem to fetch updated details
        for (CartItem item : items) {
            cart.getCartItem(item.getId());
        }

        return items;
    }
}
