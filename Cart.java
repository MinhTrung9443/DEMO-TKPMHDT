import java.util.*;

public class Cart {
    private int id;
    public Cart() {
    }
    private List<CartItem> cartItems;
    public Cart viewCart() {
        // TODO implement here
        if (cartItems.isEmpty()) {
            System.out.println("Giỏ hàng ID " + id + " trống!");
            return;
        }
        System.out.println("Thông tin giỏ hàng ID " + id + ":");
        for (CartItem item : cartItems) {
            System.out.println("Mục ID: " + item.getId());
            System.out.println("Tên sản phẩm: " + item.getProductName(item.getProductId()));
            System.out.println("Số lượng: " + item.getQuantity());
        }
    }

    public Order getPreviewOrder(List<Integer> cartItemIds) {
        // TODO implement here
        for (Integer cartItemId : cartItemIds) {
            Product previewOrder = Product.getPreviewInfo(cartItemId);
        }
        return null;
    }

    public void addToCart(int productId, int quantity) {
        // TODO implement here
        CartItem item = new CartItem(productId, quantity);
    }
}


