public class CartItem {
    public CartItem() {
    }
    private int id;
    private Product product;
    private int quantity;

    /**
     * @param productId
     */
    public void remove(int productId) {
        // TODO implement here
    }


    public String getProductName(int productId){
        // TODO implement here
        return Product.getProductNameById(productId);
    }
}


