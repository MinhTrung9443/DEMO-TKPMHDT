public class Review {
    public Review() {
    }
    private int orderId;
    private int productId;
    private int star;
    private String image;
    private String text;
    /**
     * @param orderId 
     * @param productId 
     * @param star 
     * @param text 
     * @param image
     */
    public void submitReview(int orderId, int productId, int star, String text, String image) {
        // TODO implement here
        if (validateReview(star, text, image))
            if (filter(text))
                if (checkAlreadyReview(productId))
                {
                    uploadImage(image);
                    product.addReview(this);
                }
        
    }
    /**
     * @param star 
     * @param text 
     * @param image 
     * @return
     */
    public boolean validateReview(int star, String text, String image) {
        // TODO implement here
        return false;
    }
    /**
     * @param text 
     * @return
     */
    public boolean filter(String text) {
        // TODO implement here
        return false;
    }
    /**
     * @param image  
     * @return
     */
    public String uploadImage(String image ) {
        // TODO implement here
        return "";
    }
    /**
     * @param orderId 
     * @param productId 
     * @return
     */
    public static Review getReview(int orderId, int productId) {
        // TODO implement here
        return null;
    }

}

