package vn.iotstar.demo.Model;
import java.util.*;

import vn.iotstar.demo.DAO.DBConnection;

/**
 * 
 */
public class Inventory {

    /**
     * Default constructor
     */
    public Inventory() {
    }

    /**
     * 
     */
    private int quantity;

    /**
     * 
     */
    private Product product;

    /**
     * @param newProduct 
     * @param quantity
     */
    public Inventory(Product newProduct, int quantity) {
        // TODO implement here
    }

    /**
     * @param productId 
     * @param quantity
     */
    public void updateQuantity(int productId, int quantity) {
    	DBConnection conn = new DBConnection();
    	Inventory inventory = conn.findInventoryByProductId(productId);
    	conn.save(inventory);
        // TODO implement here
    }

    /**
     * @param itemQuantity 
     * @return
     */
    public boolean checkQuantity(int itemQuantity) {
        // TODO implement here
        return false;
    }

}