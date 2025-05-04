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
    public CartItem addItem(int productId, int quantity) {
        // Kiểm tra xem sản phẩm đã có trong giỏ hàng chưa
        CartItem existingItem = null;
        for (CartItem item : cartItems) {
            if (item.getProduct() != null && item.getProduct().getId() == productId) {
                existingItem = item;
                break;
            }
        }

        if (existingItem != null) {
            // Nếu sản phẩm đã tồn tại, tăng số lượng
            existingItem.setQuantity(existingItem.getQuantity() + quantity);
            return existingItem;
        } else {
            // Nếu sản phẩm chưa tồn tại, tạo mới và thêm vào giỏ hàng
            CartItem newItem = new CartItem();
            CartItem result = newItem.addProduct(productId, quantity);
            if (result != null) {
                result.setId(cartItems.size() + 1);
                cartItems.add(result);
                return result;
            }
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