import java.time.LocalDateTime;
import java.util.*;

public class Order {
    public Order() {
    }
    private String paymentMethod;
    private String status;
    private List<OrderLineItem> orderLineItems;
    private Customer customer;
    private List<OrderStatusHistory> orderStatusHistories;
    private int orderId;

    public int getOrderId() {
        return orderId;
    }

    public String makePayment(Order previewOrder, String paymentMethod) {
        for (var item : previewOrder){
            product.checkQuantity(item);
            product.compare(item);
        }
        for (var item : previewOrder){
            //do something to get product and quantity
            OrderLineItem orderLineItem = new OrderLineItem(product, quantity);
            // TODO implement here
            Cart.remove(productId);
            // TODO implement here
            Inventory.updateQuantity(productId, quantity);

        }
        Payment payment = new Payment(orderId, total, "Đang chờ thanh toán");
        OrderStatusHistory orderStatusHistory = new OrderStatusHistory(LocalDateTime.now(), "Đã tạo đơn hàng");
        if (paymentMethod=="VNPAY"){
            payment.handleVNPAY();
        }else if (paymentMethod=="COD"){
            payment.handleCOD();
        }
        // TODO implement here
    }
    
    public Order getOrderData() {
        // TODO implement here
    }
    public Order getOrderHistory() {
        // TODO implement here
        Order orderData=this.getOrderData();
        Payment payment = Payment.getPaymentInfo(orderId);
        // TODO implement here
        return null;
    }
    public List<OrderLineItem> getOrderLineItems() {
        // TODO implement here
        for (OrderLineItem item : orderLineItems){
            item.getOrderLineItem();
        }
    }
    public List<OrderStatusHistory> getOrderStatusHistories() {
        // TODO implement here
        for (OrderStatusHistory item : orderStatusHistories){
            item.getOrderStatusHistory();
        }
    }
    public void displayAllOrders(int customerId) {
        // TODO implement here
        for (Order order : allOrders){
            if (order.getCustomer().getId() == customerId){
                order.getSummaryOrder();
                String paymentStatus=Payment.getPaymentStatus(order.getOrderId());
            }
        }
    }
    /**
     * @return
     */
    public List<Order> getAllOrders() {
        // TODO implement here
    }
    /**
     * @param productid 
     * @return
     */
    public boolean checkAlreadyReview(int productid) {
        // TODO implement here
        return false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderLineItems(List<OrderLineItem> orderLineItems) {
        this.orderLineItems = orderLineItems;
    }

    public void setOrderStatusHistories(List<OrderStatusHistory> orderStatusHistories) {
        this.orderStatusHistories = orderStatusHistories;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @param productId
     */
    public Review getReview(int productId ) {
        // TODO implement here
        Review review = Review.getReview(this.orderId, productId);
        return review;
    }
}


