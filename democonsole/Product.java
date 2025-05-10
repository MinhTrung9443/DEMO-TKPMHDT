package demo;

import java.util.Date;
import java.util.List;
public class Product {
    public Product() {
    }
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
    private List<Review> reviews;

    public Product(int productId, String description, Date expiryDate, Date importDate , Date manufactureDate, String name,  Float price, List<Review> reviews) {
        this.productId = productId;
        this.description = description;
        this.expiryDate = expiryDate;
        this.importDate = importDate;
        this.manufactureDate = manufactureDate;
        this.name = name;
        this.price = price;
        this.reviews = reviews;
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public int getProductId() {
        return productId;
    }


    public static Product getProduct(int productId) {
        if (productId <= 0) {
            System.out.println("Lỗi: ID sản phẩm không hợp lệ");
            return null;
        }
        
        Product foundProduct = GlobalStorage.products
                .stream()
                .filter(product -> product.getProductId() == productId)
                .findFirst()
                .orElse(null);
                
        if (foundProduct == null) {
            System.out.println("Không tìm thấy sản phẩm với ID: " + productId);
        }
        
        return foundProduct;
    }/**
     * Adds a review to this product's review list
     * 
     * @param review The review object to add
     */
    public void addReview(Review review) {
        if (review == null) {
            System.out.println("Không thể thêm đánh giá: Đánh giá không hợp lệ");
            return;
        }
        
        if (review.getProductId() != this.productId) {
            System.out.println("Không thể thêm đánh giá: ID sản phẩm không khớp");
            return;
        }
        
        // Check if the review already exists
        boolean reviewExists = reviews.stream()
                .anyMatch(r -> r.getOrderId() == review.getOrderId() && r.getProductId() == review.getProductId());
                
        if (reviewExists) {
            System.out.println("Không thể thêm đánh giá: Đánh giá đã tồn tại");
            return;
        }
        
        reviews.add(review);
        System.out.println("Đã thêm đánh giá cho sản phẩm: " + this.name);
    }
}






