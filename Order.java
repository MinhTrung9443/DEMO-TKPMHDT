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

    public void addOrderLineItem(OrderLineItem orderLineItem)[
        // TODO implement here
    ]

    public int getOrderId() {
        return orderId;
    }

    public String makePayment(Map<String, Object> previewOrder, String paymentMethod) {
        Cart cart = new Cart();
        Inventory inventory = new Inventory();

        for (var item : previewOrder){
            product.checkQuantity(item);
            product.compare(item);
        }
        for (var item : previewOrder){
            OrderLineItem orderLineItem = new OrderLineItem(item);
            cart.remove(item);
            inventory.updateQuantity(item.getProductId(), item.getQuantity());

        }
        Payment payment = new Payment(this, total, "Đang chờ thanh toán");
        OrderStatusHistory orderStatusHistory = new OrderStatusHistory(this, LocalDateTime.now(), "Đã tạo đơn hàng");
        this.addOrderStatusHistory(orderStatusHistory);
        if (paymentMethod=="VNPAY"){
            payment.handleVNPAY();
        }else if (paymentMethod=="COD"){
            payment.handleCOD();
        }
        // TODO implement here
    }
    

    public Order getOrderHistory() {
        // TODO implement here
        List<OrderLineItem> orderLineItem= this.getOrderLineItems();
        List<OrderStatusHistory> orderStatusHistory = this.getOrderStatusHistories();
        Payment payment = Payment.getPaymentInfo(this.getOrderId());
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
    public void displayAllOrders() {
        List<Order> orders = getAllOrders();
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


