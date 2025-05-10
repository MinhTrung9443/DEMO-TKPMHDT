
import java.io.*;
import java.util.*;

/**
 *
 */
public class Inventory {

    private int id;
    /**
     * Default constructor
     */
    public Inventory() {
    }
    private int quantity;
    private int productId;
    /**
     * @param newProduct
     * @param quantity
     */
    public Inventory(Product newProduct, int quantity) {
        // TODO implement here
    }

    public void save() {
        // TODO implement here
    }
    /**
     * @param productId
     * @param quantity
     */
    public Inventory updateQuantity(int productId, int quantity) {
        // TODO implement here
    }

    public static int getQuantity(int productId) {
        return this.quantity;
    }
}





