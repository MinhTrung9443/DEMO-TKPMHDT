import java.util.*;

public class Cart {
    public Cart() {
    }
    private List<CartItem> cartItems;
    private int quantity;
    public Cart ViewCart() {
        // TODO implement here
        for (CartItem item : cartItems) {
            CartItem cartItem = CartItem.getItem(product, quantity);
            if (cartItem.checkExistProduct()) {
                Product product = product.getProduct(product);
            }
            else return null;
        }
        return null;
    }
    /**
     * @param listCartItemId
     */
    public Object getPreviewOrder(List<Integer> listCartItemId) {
        // TODO implement here
        for (int cartItemId : listCartItemId) {
            Object previewOrder = getPreview(cartItemId);
        }
        return null;
    }
    /**
     * @param cartItemId 
     * @return
     */
    public Object getPreview(int cartItemId) {
        // TODO implement here
        CartItem cartItem = CartItem.findById(cartItemId);
        Product product = cartItem.getProduct();
        int quantity = cartItem.getQuantity();
        return null;
    }
    /**
     * @param product 
     * @param quantity
     */
    public void addProduct(Product product, int quantity) {
        // TODO implement here
    }

    public void remove(CartItem cartItem) {
        // TODO implement here
    }
}


