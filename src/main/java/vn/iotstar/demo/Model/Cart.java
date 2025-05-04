package vn.iotstar.demo.Model;
import java.util.*;

import vn.iotstar.demo.DAO.DBConnection;

/**
 * 
 */
public class Cart {

    /**
     * Default constructor
     */
    public Cart() {
    }

    /**
     * 
     */
    private int id;
    private List<CartItem> cartItems;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    /**
     * @return
     */
    public CartItem getCartItem(int cartItemId) {
        for (CartItem item : cartItems) {
            if (item.getId() == cartItemId) {
                item.viewProduct(item.getProduct().getId());
                return item;
            }
        }
        return null;
    }

    /**
     * @param cartItemIds
     */
    public Map<String, List<String>> getPreviewOrder(List<Integer> cartItemIds ) {
    	for (int i : cartItemIds)
    	{
    		List<String> previewProduct = getPreview(i);
    	}
        // TODO implement here
    	return null;
    }

    /**
     * @param cartItemId 
     * @return
     */
    public List<String> getPreview(int cartItemId) {
    	DBConnection dbConnection = new DBConnection();
    	CartItem cartItem = dbConnection.findCartItemById(cartItemId);
    	Product product = cartItem.getProduct();
    	int quantity = cartItem.getQuantity();
    	List<String> previewProduct = product.getPreview();
        // TODO implement here
        return previewProduct;
    }

    /**
     * @param quantity
     */
    public CartItem addItem(int productId, int quantity, int cartId) {
        CartItem newItem = new CartItem();
        CartItem result = newItem.addProduct(productId, quantity, cartId);
        if (result != null) {
            result.setId(cartItems.size() + 1);
            cartItems.add(result);
            return result;
        }
        return null;
    }

    /**
     * @param item
     */
    public void remove(CartItem item) {
        // TODO implement here
    }

}