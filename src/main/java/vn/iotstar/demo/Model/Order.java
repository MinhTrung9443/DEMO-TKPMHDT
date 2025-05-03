package vn.iotstar.demo.Model;
import vn.iotstar.demo.DAO.DBConnection;

import java.util.*;

/**
 * 
 */
public class Order {
    public Order() {
    }
    private String paymentMethod;
    private String status;
    private List<OrderLineItem> orderLineItems;
    private Customer customer;
    private IPaymentStrategy paymentStrategy;
    private PaymentStrategyFactory paymentStrategyFactory;
    private List<orderStatusHistory> orderStatusHistories;
    private Inventory inventory;
    private Product product;
    private Cart cart;
    private Payment payment;

    /**
     * @param orderId 
     * @return
     */
    public Order getOrderHistory(int orderId) {
        // TODO implement here
        Order order = DBConnection.getOrder(orderId);
        Payment paymnt= payment.getPaymentInfo(orderId);
        // TODO implement here
        //do something
        return result;
    }

    /**
     * @return
     */
    public List<Order> getAllOrder() {
        // TODO implement here
        List<Order> orders = DBConnection.getAllOrder();
        return orders;
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
        for (var item : previewOrder) {
            inventory.checkQuantity(item);
            product.compareItem(item);
        }
        for (var item : previewOrder) {
            OrderLineItem orderLineItem = new OrderLineItem();
            orderLineItem.setData(item);
            orderLineItem.setOrder(this);
            this.addOrderLineItem(orderLineItem);
            cart.remove(item);
            // TODO implement here
            inventory.updateQuantity(productId, quantity);
        }
        initializeOrder(this);
        paymentStrategy=paymentStrategyFactory.getPaymentStrategy(paymentMethod);
        paymentStrategy.processPayment(this);
        // TODO implement here
        return true;
    }

    /**
     * @param order
     */
    public static void initializeOrder(Order order) {
        // TODO implement here
        // do something
        // do something
        // do something
        DBConnection.saveOrder(order);
    }

    public void addOrderLineItem(OrderLineItem orderLineItem) {
        // TODO implement here
    }

}