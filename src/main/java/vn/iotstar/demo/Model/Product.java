package vn.iotstar.demo.Model;
import java.util.*;

import org.springframework.beans.BeanUtils;

import vn.iotstar.demo.DAO.DBConnection;

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
    private int productId;
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
    public int addNewProduct(Product productInfo, int quantity) {
    	if (validateInfo()==0) {
    		Product newProduct = new Product();
    		BeanUtils.copyProperties(productInfo, newProduct);
    		Inventory inventory = new Inventory(newProduct,quantity);
    		DBConnection conn = new DBConnection();
    		conn.save(inventory);
    		return 0;
    	}
        // TODO implement here
        return validateInfo();
    }

    /**
     * @return
     */
    public int validateInfo() {
        // TODO implement here
        return 0;
    }

    /**
     * @param productId 
     * @return
     */
    public Product findById(int productId) {
    	DBConnection conn = new DBConnection();
    	Product newProduct = conn.findProductById(productId);
        // TODO implement here
        return newProduct;
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
    public int updateProduct(Product ProductInfo , int quantity ) {
    	if (validateInfo()==0)
    	{
    		Inventory inventory = new Inventory();
    		inventory.updateQuantity(ProductInfo.productId, quantity);
    	}
        // TODO implement here
        return validateInfo();
    }

    public void compareItem(Object item) {
        // TODO implement here
        // do something
        // do something
        // do something
    }
}