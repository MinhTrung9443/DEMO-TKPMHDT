package vn.iotstar.demo.Model;
import java.util.*;

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
    public CartItem addProduct(int productId, int quantity) {
        CartItem result = null;
        Product service = new Product();
        Product foundProduct = service.getProductDetail(productId);
        if (foundProduct != null) {
            Inventory inventory = new Inventory();
            boolean availableQuantity = inventory.checkProductQuantity(productId, quantity);
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
        if (this.product != null && this.product.getId() == productId) {
            Product updatedProduct = new Product().getProductDetail(productId);
            if (updatedProduct != null) {
                this.product = updatedProduct;
            }
            return this.product;
        }
        return null;
    }

}