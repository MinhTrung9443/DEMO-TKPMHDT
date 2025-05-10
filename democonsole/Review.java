package demo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Review {
    private int orderId;
    private int productId;
    private int star;
    private String image;
    private String text;
    private Date reviewDate; // Thời gian đánh giá    /**

    public Review() {
        // Initialize with defaults
        this.reviewDate = new Date(); // Set current date when review is created
    }/**
     * Retrieves a review by order ID and product ID
     * 
     * @param orderId ID of the order
     * @param productId ID of the product
     * @return Review object if found, null otherwise
     */
    public static Review getReview(int orderId, int productId) {

        return GlobalStorage.reviews.stream()
                .filter(review -> review.getOrderId() == orderId && review.getProductId() == productId)
                .findFirst()
                .orElse(null);
    }
    
    /**
     * Submits a product review after validation
     * 
     * @param orderId ID of the order containing the purchased product
     * @param productId ID of the product being reviewed
     * @param star Rating given by customer (1-5)
     * @param text Review text content
     * @param image Image path or URL for the review
     */
    public void submitReview(int orderId, int productId, int star, String text, String image) {
        // Step 1: Validate review content and format
        if (!validateReview(star, text, image)) {
            return; // Validation failed, error message shown in validateReview
        }

        // Step 2: Filter inappropriate content
        if (!filter(text)) {
            return; // Filter failed, error message shown in filter
        }

        // Step 3: Verify order exists and product is part of that order
        Order order = Order.findByOrderId(orderId);
        if (order == null) {
            System.out.println("Đánh giá không hợp lệ: Không tìm thấy đơn hàng #" + orderId);
            return;
        }

        // Step 4: Check if product has already been reviewed
        if (!order.checkAlreadyReview(productId)) {
            System.out.println("Đánh giá không hợp lệ: Sản phẩm này đã được đánh giá");
            return;
        }



        // Step 5: Process image upload
        String imageUrl = uploadImage(image);
          // Step 6: Set review data
        this.orderId = orderId;
        this.productId = productId;
        this.text = text;
        this.star = star;
        this.image = imageUrl;
        this.reviewDate = new Date(); // Set current date

        // Step 7: Add review to product and global storage
        Product product = Product.getProduct(productId);
        product.addReview(this);
        GlobalStorage.reviews.add(this);

        System.out.println("Đánh giá đã được gửi thành công!");
    }
    /**
     * Validates a review based on rating, text content, and image
     * 
     * @param star Rating given by customer (1-5)
     * @param text Review text content
     * @param image Image path or URL for the review
     * @return true if the review is valid, false otherwise
     */
    public boolean validateReview(int star, String text, String image) {
        // Validate star rating
        if (star < 1 || star > 5) {
            System.out.println("Đánh giá không hợp lệ: Số sao phải từ 1 đến 5");
            return false;
        }
        
        // Validate review text length
        if (text == null || text.trim().isEmpty()) {
            System.out.println("Đánh giá không hợp lệ: Nội dung đánh giá không được để trống");
            return false;
        }
        
        if (text.length() < 50) {
            System.out.println("Đánh giá không hợp lệ: Nội dung đánh giá phải có ít nhất 50 ký tự");
            return false;
        }
        
        // Validate image path
        if (image == null || image.trim().isEmpty()) {
            System.out.println("Đánh giá không hợp lệ: Đường dẫn hình ảnh không được để trống");
            return false;
        }
        
        if (image.length() < 5) {
            System.out.println("Đánh giá không hợp lệ: Đường dẫn hình ảnh không hợp lệ");
            return false;
        }
        
        return true;
    }    /**
     * Filters inappropriate content from review text
     * 
     * @param text The text content to filter
     * @return true if text passes content filter, false if text contains inappropriate content
     */
    public boolean filter(String text) {
        if (text == null) {
            return false;
        }
        
        // Danh sách từ khóa cấm trong đánh giá
        String[] tuKhoaCam = {
            "không tốt", "tào lao", "thấy ghét", "không thích", 
            "không hài lòng", "không đáng tiền", "chất lượng kém",
            "tệ", "tồi tệ", "bực mình", "khủng khiếp"
        };
        
        // Chuyển đổi text về chữ thường để kiểm tra không phân biệt hoa thường
        String lowerText = text.toLowerCase();
        
        for (String tuKhoa : tuKhoaCam) {
            if (lowerText.contains(tuKhoa.toLowerCase())) {
                System.out.println("Đánh giá không hợp lệ: Nội dung có chứa từ ngữ không phù hợp");
                return false;
            }
        }
        
        return true;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getText() {
        return text;
    }    public void setText(String text) {
        this.text = text;
    }
    
    /**
     * Get the date when the review was submitted
     * 
     * @return Date of review submission
     */
    public Date getReviewDate() {
        return reviewDate;
    }

    /**
     * Set the date when the review was submitted
     * 
     * @param reviewDate Date of review submission
     */
    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }
    
    /**
     * Get formatted review date as string
     * 
     * @return Formatted date string
     */
    public String getFormattedReviewDate() {
        if (reviewDate == null) {
            return "N/A";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return dateFormat.format(reviewDate);
    }
    
    /**
     * Checks if the review is a verified purchase
     * 
     * @return true if this is a verified purchase review, false otherwise
     */
    public boolean isVerifiedPurchase() {
        // Always returns true since reviews can only be submitted for purchased products
        return true;
    }/**
     * Uploads an image for the review and returns a URL
     * 
     * @param image Path or identifier for the image to upload
     * @return URL to the uploaded image
     */
    public String uploadImage(String image) {
        return "https://product-reviews.images.com/" + System.currentTimeMillis() + "/" + image;
    }
    @Override
    public String toString() {
        return "Review{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", star=" + star +
                ", text='" + text + '\'' +
                ", image='" + image + '\'' +
                ", reviewDate=" + getFormattedReviewDate() +
                '}';
    }
}

