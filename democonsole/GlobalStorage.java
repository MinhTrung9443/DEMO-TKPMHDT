package demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GlobalStorage {
    static Product product1 = new Product(1, "Sản phẩm 1", new Date(),        // expiryDate
            new Date(),        // importDate
            new Date(),        // manufactureDate
            "Tên sản phẩm 1", 100.0f, new ArrayList<>());
    static Product product2 = new Product(2, "Sản phẩm 2", new Date(),        // expiryDate
            new Date(),        // importDate
            new Date(),        // manufactureDate
            "Tên sản phẩm 2", 150.0f, new ArrayList<>());
    static List<Product> products = List.of(
            product1, product2
    );
    static OrderLineItem orderLineItem1 = new OrderLineItem(1, "Sản phẩm 1", new Date(),        // expiryDate
            new Date(),        // importDate
            new Date(),        // manufactureDate
            "Tên sản phẩm 1", 100.0f, 4
    );
    static OrderLineItem orderLineItem2 = new OrderLineItem(2, "Sản phẩm 2", new Date(),        // expiryDate
            new Date(),        // importDate
            new Date(),        // manufactureDate
            "Tên sản phẩm 2", 150.0f, 3
    );





    static List<OrderLineItem> orderLineItems = List.of(
            orderLineItem1,
            orderLineItem2
    );

    static List<OrderStatusHistory> orderStatusHistories = List.of(
            new OrderStatusHistory(new Date(), "Đã giao thành công")
    );

    static Order order = new Order(
            new Customer(), 1, orderLineItems, orderStatusHistories, "VNPAY", "PENDING");

    static List<Order> orders = List.of(order);

    static List<Review> reviews = new ArrayList<>();


}
