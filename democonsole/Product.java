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

    public Product(int productId, String category, String description, Date expiryDate, Date importDate, String ingredients, Date manufactureDate, String name, String origin, Float price, String productImages, List<Review> reviews, String usageInstructions, Float volume) {
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
        this.reviews = reviews;
        this.usageInstructions = usageInstructions;
        this.volume = volume;
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
    }    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    /**
     * Calculates the average rating for this product
     * 
     * @return Average rating (0-5) or 0 if no reviews
     */
    public double getAverageRating() {
        if (reviews == null || reviews.isEmpty()) {
            return 0.0;
        }
        
        int totalStars = reviews.stream()
                .mapToInt(Review::getStar)
                .sum();
                
        return (double) totalStars / reviews.size();
    }
    
    /**
     * Gets the total number of reviews for this product
     * 
     * @return Number of reviews
     */
    public int getReviewCount() {
        return reviews == null ? 0 : reviews.size();
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
    }    /**
     * Retrieves a product by its ID
     * 
     * @param productId ID of the product to retrieve
     * @return Product object if found, null otherwise
     */
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






