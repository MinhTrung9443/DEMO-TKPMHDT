package vn.iotstar.demo.Model;
import java.util.*;

/**
 * 
 */
public class Product {

    /**
     * Default constructor
     */
    public Product() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Float price;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private String category;

    /**
     * 
     */
    private String brandName;

    /**
     * 
     */
    private String ingredients;

    /**
     * 
     */
    private String origin;

    /**
     * 
     */
    private Date manufactureDate;

    /**
     * 
     */
    private Date expiryDate;

    /**
     * 
     */
    private Date importDate;

    /**
     * 
     */
    private String usageInstructions;

    /**
     * 
     */
    private Float volume;

    /**
     * 
     */
    private String productImages;

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
    public List<String> getPreview() {
        // TODO implement here
        return null;
    }

    /**
     * @param productId  
     * @return
     */
    public Product getProductDetail(int productId ) {
        // TODO implement here
        return null;
    }

    /**
     * @param productInfo 
     * @param quantity 
     * @return
     */
    public boolean addNewProduct(Product productInfo, int quantity) {
        // TODO implement here
        return false;
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
     * @return
     */
    public Product findById(int productId) {
        // TODO implement here
        return null;
    }

    /**
     * @param item 
     * @return
     */
    public boolean compare(Product item) {
        // TODO implement here
        return false;
    }

    /**
     * @param ProductInfo  
     * @param quantity  
     * @return
     */
    public boolean updateProduct(Product ProductInfo , int quantity ) {
        // TODO implement here
        return false;
    }

}