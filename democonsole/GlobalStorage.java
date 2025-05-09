package demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GlobalStorage {
    static List<Product> products=List.of(
            new Product(1,"Fruits", "Fresh and juicy apples", null, null, "Apples", null, "Apple", "USA", 1.5f, "apple.jpg", new ArrayList<>(), "Eat fresh", 0.5f),
            new Product(2,"Vegetables", "Organic carrots", null, null, "Carrots", null, "Carrot", "USA", 0.8f, "carrot.jpg", new ArrayList<>(), "Cook or eat raw", 0.3f)
    );
    static List<OrderLineItem> orderLineItems = List.of(
            new OrderLineItem(1,"Category1", "Description", null, null, "Ingredients1", null, "Name1", "Origin1", 0.0f, "Product Images1", 2, "Usage Instructions", 20.0f),
            new OrderLineItem(2,"Category2", "Description", null, null, "Ingredients2", null, "Name2", "Origin2", 0.0f, "Product Images2", 5, "Usage Instructions", 10.0f)
    );
    static List<OrderStatusHistory> orderStatusHistories = List.of(
            new OrderStatusHistory(new Date(), "Đã giao thành công")
    );
    static Order order= new Order(new Customer(), 1, orderLineItems, orderStatusHistories, "Credit Card", "Pending");
    static List<Order> orders = List.of(order);
    static List<Review> reviews = new ArrayList<>();

}
