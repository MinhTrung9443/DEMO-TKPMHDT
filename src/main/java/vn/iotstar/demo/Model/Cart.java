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
    private List<CartItem> cartItems;

    /**
     * 
     */
    private int Quantity;

    /**
     * @param cartItemId 
     * @return
     */
    public CartItem getCartItem(int cartItemId) {
        // TODO implement here
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
    	DBConnection conn = new DBConnection();
    	CartItem cartItem = conn.findCartItemById(cartItemId);
    	Product product = cartItem.getProduct();
    	int quantity = cartItem.getQuantity();
    	List<String> previewProduct = product.getPreview();
        // TODO implement here
        return previewProduct;
    }

    /**
     * @param cartItemId
     */
    public void addItem(int cartItemId) {
        // TODO implement here
    }

    /**
     * @param item
     */
    public void remove(CartItem item) {
        // TODO implement here
    }

}