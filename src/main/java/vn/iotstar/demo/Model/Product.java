package vn.iotstar.demo.Model;
import java.util.*;
import vn.iotstar.demo.DAO.DBConnection;

/**
 * 
 */
public class Product {

    /**
     * Default constructor
     */
    public Product() {
    }
    private int id;
    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Float price;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private String category;

    /**
     * 
     */
    private String brandName;

    /**
     * 
     */
    private String ingredients;

    /**
     * 
     */
    private String origin;

    /**
     * 
     */
    private Date manufactureDate;

    /**
     * 
     */
    private Date expiryDate;

    /**
     * 
     */
    private Date importDate;

    /**
     * 
     */
    private String usageInstructions;

    /**
     * 
     */
    private Float volume;

    /**
     * 
     */
    private String productImages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public String getUsageInstructions() {
        return usageInstructions;
    }

    public void setUsageInstructions(String usageInstructions) {
        this.usageInstructions = usageInstructions;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public String getProductImages() {
        return productImages;
    }

    public void setProductImages(String productImages) {
        this.productImages = productImages;
    }

    /**
     * @param product  
     * @return
     */
    public Product getProduct(Product product ) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<String> getPreview() {
        // TODO implement here
        return null;
    }

    /**
     * @param productId  
     * @return
     */
    public Product getProductDetail(int productId ) {
        Product result = DBConnection.findProductById(productId);
        return result;
    }

    /**
     * @param productInfo 
     * @param quantity 
     * @return
     */
    public boolean addNewProduct(Product productInfo, int quantity) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean validateInfo() {
        // TODO implement here
        return false;
    }

    /**
     * @param productId 
     * @return
     */
    public Product findById(int productId) {
        // TODO implement here
        return null;
    }

    /**
     * @param item 
     * @return
     */
    public boolean compare(Product item) {
        // TODO implement here
        return false;
    }

    /**
     * @param ProductInfo  
     * @param quantity  
     * @return
     */
    public boolean updateProduct(Product ProductInfo , int quantity ) {
        // TODO implement here
        return false;
    }

}