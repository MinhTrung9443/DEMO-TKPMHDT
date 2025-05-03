package vn.iotstar.demo.Model;
import java.util.*;

/**
 * 
 */
public interface IPaymentStrategy {
    boolean processPayment(Order order);
}