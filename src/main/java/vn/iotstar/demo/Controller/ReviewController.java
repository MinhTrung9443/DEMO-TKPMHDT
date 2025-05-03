package vn.iotstar.demo.Controller;

import org.springframework.stereotype.Controller;

import vn.iotstar.demo.Model.Review;


/**
 * 
 */
@Controller
public class ReviewController {
	/**
     * Default constructor
     */
    public ReviewController() {
    }

    /**
     * 
     */
    private Review review;


    /**
     * @param orderId  
     * @param productId
     */
    public void getReview(int orderId , int productId) {
        // TODO implement here
    }

    /**
     * @param orderId 
     * @param productId 
     * @param star 
     * @param text 
     * @param image 
     * @return
     */
    public void submitReview(int orderId, int productId, int star, String text, String image) {
        // TODO implement here
        review.submitReview(orderId, productId, star, text, image);
        // TODO implement here
    }
}
