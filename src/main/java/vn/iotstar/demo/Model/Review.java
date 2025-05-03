package vn.iotstar.demo.Model;
import java.util.*;

/**
 * 
 */
public class Review {

    /**
     * Default constructor
     */
    public Review() {
    }

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private String image;

    /**
     * 
     */
    private int star;

    /**
     * @param orderId 
     * @param productId 
     * @param star 
     * @param text 
     * @param image 
     * @return
     */
    public boolean submitReview(int orderId, int productId, int star, String text, String image) {
        // TODO implement here
        return false;
    }

    /**
     * @param star 
     * @param text 
     * @param image 
     * @return
     */
    public boolean validateReviewContent(int star, String text, String image) {
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
    public Review getReview(int orderId, int productId) {
        // TODO implement here
        return null;
    }

}