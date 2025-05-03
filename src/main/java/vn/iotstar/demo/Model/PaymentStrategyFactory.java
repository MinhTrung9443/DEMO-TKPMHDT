package vn.iotstar.demo.Model;
import java.util.*;

/**
 * 
 */
public class PaymentStrategyFactory {

    /**
     * Default constructor
     */
    public PaymentStrategyFactory() {
    }

    /**
     * @param paymentMethod 
     * @return
     */
    public IPaymentStrategy getPaymentStrategy(String paymentMethod) {
        if (paymentMethod == "COD") {
            return new CODPayment();
        } else if (paymentMethod == "VNPAY") {
            return new VNPAYPayment();
        }
        return null;
    }

}