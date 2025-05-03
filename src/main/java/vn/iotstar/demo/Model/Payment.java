package vn.iotstar.demo.Model;
import vn.iotstar.demo.DAO.DBConnection;

import java.util.*;

/**
 * 
 */
public class Payment {

    /**
     * Default constructor
     */
    public Payment() {
    }

    /**
     * 
     */
    private String paymentMethod;

    /**
     * @param orderId 
     * @return
     */
    public Payment getPaymentInfo(int orderId) {
        // TODO implement here
        Payment payment = DBConnection.getPaymentInfo(orderId);
        return payment;
    }

}