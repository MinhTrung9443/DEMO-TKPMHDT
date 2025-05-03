package vn.iotstar.demo.Controller;
import java.util.*;

import org.springframework.stereotype.Controller;

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
        // TODO implement here
    }

    /**
     * @param orderId
     */
    public void getOrderHistory(int orderId) {
        // TODO implement here
    }

    /**
     * 
     */
    public void displayAllOrder() {
        // TODO implement here
    }

}