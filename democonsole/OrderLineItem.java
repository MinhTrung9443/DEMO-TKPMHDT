package demo;

import java.util.Date;
import java.util.List;

public class OrderLineItem {
    private int productId;
    private String name;
    private Float price;
    private String description;
    private String category;
    private String ingredients;
    private String origin;
    private Date manufactureDate;
    private Date expiryDate;
    private Date importDate;
    private String usageInstructions;
    private Float volume;
    private String productImages;
    private int quantity;


    public int getProductId() {
        return productId;
    }


    public OrderLineItem(int productId, String description, Date expiryDate, Date importDate, Date manufactureDate, String name, Float price, int quantity) {
        this.productId = productId;
        this.description = description;
        this.expiryDate = expiryDate;
        this.importDate = importDate;
        this.manufactureDate = manufactureDate;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}





