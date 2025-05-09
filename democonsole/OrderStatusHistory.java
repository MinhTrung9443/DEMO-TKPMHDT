package demo;

import java.util.Date;

public class OrderStatusHistory {
    public OrderStatusHistory() {
    }
    private Date dateTime;
    private String status;

    public OrderStatusHistory getOrderStatusHistory() {
        return this;
    }

    public OrderStatusHistory(Date dateTime, String status) {
        this.dateTime = dateTime;
        this.status = status;
    }
}