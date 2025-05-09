package demo;

import java.util.Date;
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


    public OrderLineItem getOrderLineItem() {
        return this;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductImages() {
        return productImages;
    }

    public void setProductImages(String productImages) {
        this.productImages = productImages;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUsageInstructions() {
        return usageInstructions;
    }

    public void setUsageInstructions(String usageInstructions) {
        this.usageInstructions = usageInstructions;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public OrderLineItem(int productId, String category, String description, Date expiryDate, Date importDate, String ingredients, Date manufactureDate, String name, String origin, Float price, String productImages, int quantity, String usageInstructions, Float volume) {
        this.productId = productId;
        this.category = category;
        this.description = description;
        this.expiryDate = expiryDate;
        this.importDate = importDate;
        this.ingredients = ingredients;
        this.manufactureDate = manufactureDate;
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.productImages = productImages;
        this.quantity = quantity;
        this.usageInstructions = usageInstructions;
        this.volume = volume;
    }
}





