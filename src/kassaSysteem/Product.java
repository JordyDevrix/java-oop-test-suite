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

    public String toString() {
        return String.format("%s %s", productBrand, productType);
    }

    public String getProductData() {
        return String.format("%s %s", productBrand, productType);
    }

    public String getProductBarcode() {
        return productBarcode;
    }
}
