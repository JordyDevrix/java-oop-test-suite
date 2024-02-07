package kassaSysteem;

public class Product {
    private String productBarcode;
    private String productBrand;
    private String productType;

    // Creating constructor
    public Product(String productBarcode, String productBrand, String productType) {
        this.productBarcode = productBarcode;
        this.productBrand = productBrand;
        this.productType = productType;
    }

    public String getProduct() {
        return String.format("%s %s", productBrand, productType);
    }

    public String getID() {
        return productBarcode;
    }
}
