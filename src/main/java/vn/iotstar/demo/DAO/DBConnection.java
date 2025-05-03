package vn.iotstar.demo.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import vn.iotstar.demo.Model.CartItem;
import vn.iotstar.demo.Model.Inventory;
import vn.iotstar.demo.Model.Order;
import vn.iotstar.demo.Model.Payment;
import vn.iotstar.demo.Model.Product;
import vn.iotstar.demo.Model.Review;

@Repository
public class DBConnection {
	// Thông tin kết nối
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=test;encrypt=true;trustServerCertificate=true";
    private static final String USER = "sa";
    private static final String PASSWORD = "123456";

    // Hàm tĩnh để lấy kết nối
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("JDBC Driver not found", e);
        }
    }
    
    /**
     * Default constructor
     */
    public DBConnection() {
    }

    /**
     * @param order
     */
    public void saveOrder(Order order) {
        // TODO implement here
    }

    /**
     * @param order
     */
    public static void updateOrder(Order order) {
        // TODO implement here
    }

    /**
     * @param cartItemId  
     * @return
     */
    public CartItem findCartItemById(int cartItemId ) {
        // TODO implement here
        return null;
    }

    /**
     * @param productId 
     * @return
     */
    public Product findProductById(int productId) {
        // TODO implement here
        return null;
    }

    /**
     * @param orderId 
     * @return
     */
    public Order getOrder(int orderId) {
        // TODO implement here
        return null;
    }

    /**
     * @param orderId 
     * @return
     */
    public Payment getPaymentInfo(int orderId) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Order> getAllOrder() {
        // TODO implement here
        return null;
    }

    /**
     * @param reivew
     */
    public void addReview(Review reivew) {
        // TODO implement here
    }

    /**
     * @param inventory
     */
    public void save(Inventory inventory) {
        // TODO implement here
    }

    /**
     * @param productId 
     * @return
     */
    public Inventory findInventoryByProductId(int productId) {
        // TODO implement here
        return null;
    }

    /**
     * @param productId
     */
    public void checkProductQuantity(int productId) {
        // TODO implement here
    }

    /**
     * @param orderId 
     * @param productId 
     * @return
     */
    public Review getReview(int orderId, int productId) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Connection getSingletonInstance() {
        // TODO implement here
        return null;
    }

    
}