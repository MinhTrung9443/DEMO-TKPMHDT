
import java.util.*;
public class Product {
    public Product() {
    }
    private int productId;
    private String name;
    private Float price;
    private String description;
    private String category;
    private String ingredients;
    private String origin;
    private Date manufactureDate;
    private Date expiryDate;
    private Date importDate;
    private String usageInstructions;
    private Float volume;
    private String productImages;

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    private List<Review> reviews;


    public Product getSummaryProduct() {
        // TODO implement here
        return null;
    }

    public Product getProduct(Product product ) {
        // TODO implement here
        return null;
    }

    public static  List<String> getPreviewInfo(int cartItemId) {
        // TODO implement here
        return null;
    }

    public static Product getProductDetail(Product product) {
        // TODO implement here
        return null;
    }

    public Product findByProduct(Product product) {
        // TODO implement here
        return null;
    }

    public void addReview(Review review) {
        // TODO implement here
        reviews.add(review);
    }

    public void displayAddProduct() {
        // TODO implement here
    }

    public void addNewProduct(Product productInfo, int quantity) {
        // TODO implement here
        if (this.validateInfo())
        {
            Inventory inventory = new Inventory(productInfo, quantity);
            inventory.save();
        }
    }

    public boolean validateInfo() {
        // TODO implement here
        return false;
    }

    public void displayUpdateProduct(int productId) {
        // TODO implement here
        Product product = this.findById(productId);
    }

    public Product findById(int productId) {
        // TODO implement here
        return null;
    }
    public void save() {
        // TODO implement here
    }
    public void updateProduct(Product productInfo, int quantity) {
        // TODO implement here
        if (this.validateInfo()) {
            Inventory inventory = new Inventory();
            inventory.updateQuantity(productId, quantity);
            inventory.save();

        }
    }

    public static void viewDetail(int id) {
        boolean found = false;
        for (Product product : products) {
            if (product.productId == id) {
                found = true;
                System.out.println("Thông tin sản phẩm:");
                System.out.println(product.getProductDetail());
                break;
            }
        }
        if (!found) {
            System.out.println("Lỗi: Không tìm thấy sản phẩm với ID " + id);
        }
    }

    public String getProductDetail() {
        return "ID: " + productId + "\n" +
            "Tên: " + name + "\n" +
            "Giá: " + price + " VND\n" +
            "Mô tả: " + description + "\n" +
            "Danh mục: " + category + "\n" +
            "Thành phần: " + ingredients + "\n" +
            "Xuất xứ: " + origin + "\n" +
            "Ngày sản xuất: " + manufactureDate + "\n" +
            "Ngày hết hạn: " + expiryDate + "\n" +
            "Ngày nhập khẩu: " + importDate + "\n" +
            "Hướng dẫn sử dụng: " + usageInstructions + "\n" +
            "Hình ảnh: " + productImages;
    }

    public static String getProductNameById(int id){
        for (Product product : products){
            if (product.productId == id){
                return product.getName();
            }
        }
        return "Không tìm thấy sản phẩm với ID: " + id;
    }

    public static boolean findProductById(int productId){
        for (Product product : products){
            if (product.getProductId() == productId){
                return true;
            }
        }
        return false;
    }
}






