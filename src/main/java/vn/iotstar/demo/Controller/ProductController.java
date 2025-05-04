package vn.iotstar.demo.Controller;
import java.util.*;

import org.springframework.stereotype.Controller;

import vn.iotstar.demo.Model.Product;

/**
 * 
 */
@Controller
public class ProductController {

    /**
     * Default constructor
     */
    public ProductController() {
    }

    /**
     * 
     */
    private Product product;

    /**
     * 
     */
    public void viewDetail() {
        // TODO implement here
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
    	product.addNewProduct(productInfo, quantity);
        // TODO implement here
    }

    /**
     * @param productId
     */
    public void displayUpdateProduct(int productId) {
    	Product pro = product.findById(productId);
        // TODO implement here
    }

    /**
     * @param ProductInfo 
     * @param quantity
     */
    public void updateProduct(Product ProductInfo, int quantity) {
    	boolean success = product.updateProduct(ProductInfo, quantity);
        // TODO implement here
    }

    /**
     * @param product 
     * @return
     */
    public boolean checkExit(Product product) {
        // TODO implement here
        return false;
    }

}