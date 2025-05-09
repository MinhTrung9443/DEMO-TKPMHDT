package demo;

import java.util.List;

public class Order {
    public Order() {
    }
    private String paymentMethod;
    private String status;
    private List<OrderLineItem> orderLineItems;
    private Customer customer;
    private List<OrderStatusHistory> orderStatusHistories;
    private int orderId;

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", status='" + status + '\'' +
                ", orderLineItems=" + orderLineItems +
                ", orderStatusHistories=" + orderStatusHistories +
                ", orderId=" + orderId +
                '}';
    }    /**
     * Retrieves a review for a specific product in this order
     * 
     * @param productId ID of the product to get the review for
     * @return Review object if found, null otherwise
     */
    public Review getReview(int productId) {
        // Validate product ID
        if (productId <= 0) {
            System.out.println("Lỗi: ID sản phẩm không hợp lệ");
            return null;
        }
        
        // Check if product exists in this order
        boolean productInOrder = this.orderLineItems.stream()
                .anyMatch(item -> item.getProductId() == productId);
                
        if (!productInOrder) {
            System.out.println("Lỗi: Sản phẩm #" + productId + " không tồn tại trong đơn hàng #" + this.orderId);
            return null;
        }
        
        // Get the review using static method
        Review review = Review.getReview(this.orderId, productId);
        
        if (review == null) {
            System.out.println("Thông báo: Chưa có đánh giá cho sản phẩm #" + productId + " trong đơn hàng #" + this.orderId);
        }
        
        return review;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<OrderLineItem> getOrderLineItems() {
        return orderLineItems;
    }

    public void setOrderLineItems(List<OrderLineItem> orderLineItems) {
        this.orderLineItems = orderLineItems;
    }

    public List<OrderStatusHistory> getOrderStatusHistories() {
        return orderStatusHistories;
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

    public Order(Customer customer, int orderId, List<OrderLineItem> orderLineItems, List<OrderStatusHistory> orderStatusHistories, String paymentMethod, String status) {
        this.customer = customer;
        this.orderId = orderId;
        this.orderLineItems = orderLineItems;
        this.orderStatusHistories = orderStatusHistories;
        this.paymentMethod = paymentMethod;
        this.status = status;
     }    /**
     * Checks if a product in this order is eligible for review (has not been reviewed yet)
     * 
     * @param productId ID of the product to check
     * @return true if the product has not been reviewed yet, false otherwise
     */
    public boolean checkAlreadyReview(int productId) {
        // Kiểm tra nếu sản phẩm thuộc đơn hàng này
        boolean productInOrder = this.orderLineItems.stream()
                .anyMatch(item -> item.getProductId() == productId);
        
        if (!productInOrder) {
            System.out.println("Không thể đánh giá: Sản phẩm #" + productId + " không có trong đơn hàng #" + this.orderId);
            return false;
        }

        // Kiểm tra xem sản phẩm đã được đánh giá chưa
        boolean notReviewedYet = GlobalStorage.reviews
                .stream()
                .noneMatch(review -> review.getOrderId() == this.orderId && review.getProductId() == productId);
        
        if (!notReviewedYet) {
            System.out.println("Sản phẩm #" + productId + " đã được đánh giá trước đó");
        }
        
        return notReviewedYet;
    }    /**
     * Finds an order by its ID
     * 
     * @param orderId ID of the order to find
     * @return Order object if found, null otherwise
     */
    public static Order findByOrderId(int orderId) {
        if (orderId <= 0) {
            System.out.println("Lỗi: ID đơn hàng không hợp lệ");
            return null;
        }
        
        Order foundOrder = GlobalStorage.orders
                .stream()
                .filter(order -> order.getOrderId() == orderId)
                .findFirst()
                .orElse(null);
                
        if (foundOrder == null) {
            System.out.println("Không tìm thấy đơn hàng với ID: " + orderId);
        }
        
        return foundOrder;
    }

    public List<Order> getAllOrders() {
        // TODO implement here
        return GlobalStorage.orders;
    }
}


