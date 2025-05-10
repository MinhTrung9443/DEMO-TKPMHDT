package demo;
import static demo.GlobalStorage.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Đơn hàng : " + order);
        System.out.println("Các đánh giá cho sản phẩm thứ nhất: ");

        System.out.println(order.getReview(order.getOrderLineItems().get(0).getProductId() ));
        System.out.println("--------------------------");
        System.out.println("Đang tiến hành đánh giá sản phẩm thứ nhất: ");
        Review review = new Review();
        review.submitReview(order.getOrderId(),order.getOrderLineItems().get(0).getProductId(), 5, "Sản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốtSản phẩm rất tốt","Link ảnh Link ảnh");
        System.out.println("Đánh giá sản phẩm thứ nhất thành công, đánh giá hiện tại của sản phẩm thứ nhất trong đơn hàng là: ");
        System.out.println(order.getReview(order.getOrderLineItems().get(0).getProductId() ));

    }
}
