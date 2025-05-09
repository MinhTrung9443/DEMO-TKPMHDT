public class CartItem {
    public CartItem() {
    }
    private Product product;
    private int quantity;
    /**
     * @param product 
     * @param quantity 
     * @return
     */
    public CartItem getItem(Product product, int quantity) {
        // TODO implement here
        return null;
    }
    /**
     * @param product 
     * @return
     */
    public boolean checkExistProduct(Product product) {
        // TODO implement here
        return false;
    }
    /**
     * @param cartItemId 
     * @return
     */
    public static CartItem findById(int cartItemId) {
        // TODO implement here
        return null;
    }
    /**
     * @return
     */
    public Product getProduct() {
        // TODO implement here
        return null;
    }
    /**
     * @return
     */
    public int getQuantity() {
        // TODO implement here
        return 0;
    }
    /**
     * @param cartItemId
     */
    public void addCartItem(int cartItemId) {
        // TODO implement here
    }
    /**
     * @param product 
     * @param quantity 
     * @return
     */
    public boolean checkQuantity(Product product, int quantity) {
        // TODO implement here
        return false;
    }
}


