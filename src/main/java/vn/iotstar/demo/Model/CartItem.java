package vn.iotstar.demo.Model;
import java.util.*;
import vn.iotstar.demo.DAO.DBConnection;

/**
 * 
 */
public class CartItem {

    /**
     * Default constructor
     */
    public CartItem() {
    }

    private int id;
    /**
     * 
     */
    private Product product;

    /**
     * 
     */
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return
     */
    public Product getProduct() {
        // TODO implement here
        return null;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return
     */
    public int getQuantity() {
        // TODO implement here
        return 0;
    }

    /**
     * @param productId
     * @param quantity 
     * @return
     */
    public CartItem addProduct(int productId, int quantity, int cartId) {
        CartItem result = null;
        DBConnection connection = new DBConnection();
        boolean existProduct = connection.existProductInCart(productId, cartId);
        boolean availableQuantity = false;
        if (existProduct){
            for (CartItem existingItem : new Cart().getCartItems()) {
                if (existingItem.getProduct() != null && existingItem.getProduct().getId() == productId) {
                    availableQuantity = connection.checkProductQuantity(productId, quantity);
                    if (availableQuantity) {
                        int newQuantity = existingItem.getQuantity() + quantity;
                        boolean updateQuantity = connection.updateProductQuantityInCart(productId, cartId, newQuantity);
                        if (updateQuantity){
                            existingItem.setQuantity(newQuantity);
                            result = existingItem;
                        }
                    }
                    return result;
                }
            }
        }

        Product service = new Product();
        Product foundProduct = service.getProductDetail(productId);
        if (foundProduct != null) {
            availableQuantity = connection.checkProductQuantity(productId, quantity);
            if (availableQuantity) {
                result = new CartItem();
                result.setProduct(foundProduct);
                result.setQuantity(quantity);
            }
        }
        return result;
    }

    /**
     * @return
     */
    public Product viewProduct(int productId) {
        Product result = new Product().getProductDetail(productId);
        return result;
    }

}