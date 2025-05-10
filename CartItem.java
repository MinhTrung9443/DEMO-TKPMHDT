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
            // Kiểm tra tồn kho trong Inventory
            int availableQuantity = Inventory.getQuantity(productId);
            if (availableQuantity <= 0) {
                System.out.println("Thêm sản phẩm thất bại do đã hết hàng hoặc sản phẩm không đủ");
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

    public CartItem getItem(Product product, int quantity) {
        // TODO implement here
        return null;
    }

    public boolean checkExistProduct(Product product) {
        // TODO implement here
        return false;
    }

    public static CartItem findById(int cartItemId) {
        // TODO implement here
        return null;
    }

    public int getQuantity() {
        // TODO implement here
        return 0;
    }

    public void addCartItem(int cartItemId) {
        // TODO implement here
    }

    public boolean checkQuantity(Product product, int quantity) {
        // TODO implement here
        return false;
    }

    public String getProductName(int productId){
        // TODO implement here
        return Product.getProductNameById(productId);
    }
}


