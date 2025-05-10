

public class Payment {
    public Payment() {
    }
    /**
     * 
     */
    private String paymentMethod;

    /**
     * 
     */
    private int orderId;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private int total;
    /**
     * @param orderId 
     * @param total 
     * @param status
     */
    public void Payment(int orderId, int total, String status) {
        // TODO implement here
    }

    /**
     * 
     */
    public void handleCOD() {
        // TODO implement here
    }

    /**
     * 
     */
    public void handleVNPAY() {
        // TODO implement here
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
     * @param orderId 
     * @return
     */
    public String getPaymentStatus(int orderId) {
        // TODO implement here
        return "";
    }
}









