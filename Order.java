import Customer;
import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class Order {
    public Order() {
    }
    private String shippingMethod;
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
            OrderLineItem orderLineItem = new OrderLineItem();
            orderLineItem.setData(item);
            orderLineItems.setOrder(this);
            this.addOrderLineItems(orderLineItem);
        }
        cart.remove(item);
        inventory.updateQuantity(item.getProductId(), item.getQuantity());
        Payment payment = new Payment(this, total, "Đang chờ thanh toán");
        OrderStatusHistory orderStatusHistory = new OrderStatusHistory(this, LocalDateTime.now(), "Đã tạo đơn hàng");
        this.addOrderStatusHistory(orderStatusHistory);
        if (paymentMethod=="VNPAY"){
            payment.paymentSuccess();
            // TODO implement here
            if (payment.isSuccess()){
                OrderStatusHistory orderStatusHistory = new OrderStatusHistory(this, LocalDateTime.now(), "Đã thanh toán");
                this.addOrderStatusHistory(orderStatusHistory);
            }
            else{
                // TODO implement here
            }
        }else if (paymentMethod=="COD"){
            OrderStatusHistory orderStatusHistory = new OrderStatusHistory(this, LocalDateTime.now(), "Chờ đóng gói");
            this.addOrderStatusHistory(orderStatusHistory);
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
    /**
     * @param productId
     */
    public Review getReview(int productId ) {
        // TODO implement here
        Review review = Review.getReview(this.orderId, productId);
        return review;
    }
}


