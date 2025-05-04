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
    public String addToCart(int productId, int quantity, int cartId) {
        CartItem item = cart.addItem(productId, quantity, cartId);
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

        List<CartItem> updateItems = new ArrayList<>();
        for (CartItem item : items) {
            CartItem updateItem = cart.getCartItem(item.getId());
            if (updateItem != null){
                updateItems.add(updateItem);
            }
            cart.getCartItem(item.getId());
        }

        return updateItems;
    }
}
