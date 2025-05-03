package vn.iotstar.demo.Model;
import vn.iotstar.demo.DAO.DBConnection;

import java.util.*;

/**
 * 
 */
public class VNPAYPayment implements IPaymentStrategy{

    /**
     * Default constructor
     */
    public VNPAYPayment() {
    }

    /**
     * @param order
     */
    public boolean processPayment(Order order) {
        // TODO implement here
        DBConnection.updateOrder(order);
        // TODO implement here
    }

}