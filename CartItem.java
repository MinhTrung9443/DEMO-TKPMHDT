public class CartItem {
    public CartItem() {
    }
    private int id;
    private int productId;
    private int quantity;

    public CartItem(int id, int productId, int quantity) {
            this.id = id;
            this.productId = productId;
            this.quantity = quantity;
    }
    public CartItem(int productId, int quantity) {
            this.productId = productId;
            this.quantity = quantity;
        boolean existProduct = Product.findProductById(productId);
        if (existProduct){
            int availableQuantity = Inventory.getQuantity(productId);
            if (availableQuantity <= 0) {
                return;
            }
            if (availableQuantity >= quantity) {
                    System.out.println("Thêm sản phẩm thành công");
            } else {
                    System.out.println("Thêm sản phẩm thất bại do đã hết hàng hoặc sản phẩm không đủ");
            }
        } else {
                System.out.println("Thêm sản phẩm thất bại do không tìm thấy sản phẩm");
        }
    }
    public int getId() {
        return id;
    }
    public int getProductId() {
        return productId;
    }

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


