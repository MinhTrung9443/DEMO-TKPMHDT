
import java.util.*;
public class Product {
    public Product() {
    }
    private int productId;
    private String name;
    private Float price;
    private String description;
    private String category;
    private String ingredients;
    private String origin;
    private Date manufactureDate;
    private Date expiryDate;
    private Date importDate;
    private String usageInstructions;
    private Float volume;
    private String productImages;
    private List<Review> reviews;
    /**
     * @param product  
     * @return
     */
    public Product getProduct(Product product ) {
        // TODO implement here
        return null;
    }
    /**
     * @return
     */
    public static  List<String> getPreviewInfo(int cartItemId) {
        // TODO implement here
        return null;
    }
    /**
     * @param product 
     * @return
     */
    public static Product getProductDetail(Product product) {
        // TODO implement here
        return null;
    }
    /**
     * @param product 
     * @return
     */
    public Product findByProduct(Product product) {
        // TODO implement here
        return null;
    }
    /**
     * @param review
     */
    public void addReview(Review review) {
        // TODO implement here
        reviews.add(review);
    }
    /**
     * 
     */
    public void displayAddProduct() {
        // TODO implement here
    }
    /**
     * @param productInfo 
     * @param quantity
     */
    public void addNewProduct(Product productInfo, int quantity) {
        // TODO implement here
        if (this.validateInfo())
        {
            Inventory inventory = new Inventory(productInfo, quantity);
            inventory.save();
        }
    }
    /**
     * @return
     */
    public boolean validateInfo() {
        // TODO implement here
        return false;
    }
    /**
     * @param productId
     */
    public void displayUpdateProduct(int productId) {
        // TODO implement here
        Product product = this.findById(productId);
    }
    /**
     * @param productId 
     * @return
     */
    public Product findById(int productId) {
        // TODO implement here
        return null;
    }
    public void save() {
        // TODO implement here
    }
    public void updateProduct(Product productInfo, int quantity) {
        // TODO implement here
        if (this.validateInfo()) {
            Inventory inventory = new Inventory();
            inventory.updateQuantity(productId, quantity);
            inventory.save();

        }
    }
}






