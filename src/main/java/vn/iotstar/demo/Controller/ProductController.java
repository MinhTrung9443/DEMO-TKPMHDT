package vn.iotstar.demo.Controller;
import java.util.*;

import org.springframework.stereotype.Controller;

import vn.iotstar.demo.Model.Product;
import vn.iotstar.demo.Model.Response;

/**
 * 
 */
@Controller
public class ProductController {

    /**
     * Default constructor
     */
    public ProductController() {
    }

    /**
     * 
     */
    private Product product;

    /**
     * 
     */
    public Response<Product> viewDetail(int productId) {
        // TODO implement here
        Response<Product> response = new Response<>();
        Product service = new Product();
        if (product.getProductDetail(productId) != null){
            response.setData(product);
        } else {
            response.setMessage("Lỗi không tìm thấy thông tin sản phẩm, vui lòng thử lại");
        }
        return response;
    }

    /**
     * 
     */
    public void displayAddProduct() {
        // TODO implement here
    }

    /**
     * @param productInfo 
     * @param quantity
     */
    public void addNewProduct(Product productInfo, int quantity) {
    	int success = product.addNewProduct(productInfo, quantity);
        // TODO implement here
    }

    /**
     * @param productId
     */
    public void displayUpdateProduct(int productId) {
    	Product pro = product.findById(productId);
        // TODO implement here
    }

    /**
     * @param ProductInfo 
     * @param quantity
     */
    public void updateProduct(Product ProductInfo, int quantity) {
    	int success = product.updateProduct(ProductInfo, quantity);
        // TODO implement here
    }

}