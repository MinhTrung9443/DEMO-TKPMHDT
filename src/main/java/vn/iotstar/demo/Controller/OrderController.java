package vn.iotstar.demo.Controller;
import java.util.*;

import org.springframework.stereotype.Controller;

import vn.iotstar.demo.Model.Cart;
import vn.iotstar.demo.Model.Order;

/**
 * 
 */
@Controller
public class OrderController {

    /**
     * Default constructor
     */
    public OrderController() {
    }

    /**
     * 
     */
    private Order order;
    /**
     * 
     */
    private Cart cart;

    /**
     * @param previewOrder  
     * @param paymentMethod
     */
    public void makePayment(Map previewOrder , String paymentMethod) {
        order.makePayment(previewOrder, paymentMethod);
        // TODO implement here
    }

    /**
     * @param cartItemIds
     */
    public void getPreviewOrder(List<Integer> cartItemIds ) {
    	Map<String, List<String>> preview = cart.getPreviewOrder(cartItemIds);
        // TODO implement here
    }

    /**
     * @param orderId
     */
    public void getOrderHistory(int orderId) {
        // TODO implement here
        order.getOrderHistory(orderId);
    }

    /**
     * 
     */
    public void displayAllOrder() {
        // TODO implement here
        List<Order> orders = order.getAllOrder();
        // TODO implement here
    }

}