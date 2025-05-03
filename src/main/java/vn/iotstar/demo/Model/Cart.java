package vn.iotstar.demo.Model;
import java.util.*;

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
    public void getPreviewOrder(List<Integer> cartItemIds ) {
        // TODO implement here
    }

    /**
     * @param cartItemId 
     * @return
     */
    public List<String> getPreview(int cartItemId) {
        // TODO implement here
        return null;
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