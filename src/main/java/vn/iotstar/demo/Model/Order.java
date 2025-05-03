package vn.iotstar.demo.Model;
import java.util.*;

/**
 * 
 */
public class Order {

    /**
     * Default constructor
     */
    public Order() {
    }

    /**
     * 
     */
    private String paymentMethod;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private List<OrderLineItem> orderLineItems;

    /**
     * 
     */
    private Customer customer;

    /**
     * 
     */
    private IPaymentStrategy paymentStrategy;

    /**
     * 
     */
    private PaymentStrategyFactory paymentStrategyFactory;

    /**
     * 
     */
    private List<orderStatusHistory> orderStatusHistories;

    /**
     * @param orderId 
     * @return
     */
    public Order getOrderHistory(int orderId) {
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
     * @param productid 
     * @return
     */
    public boolean checkAlreadyReview(int productid) {
        // TODO implement here
        return false;
    }

    /**
     * @param previewOrder  
     * @param paymentMethod 
     * @return
     */
    public boolean makePayment(Map previewOrder , String paymentMethod) {
        // TODO implement here
        return false;
    }

    /**
     * @param order
     */
    public void initializeOrder(Order order) {
        // TODO implement here
    }

}