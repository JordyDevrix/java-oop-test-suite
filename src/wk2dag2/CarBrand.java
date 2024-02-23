package wk2dag2;

abstract class CarBrand {
    private String brand;

    public CarBrand(String brand) {
        this.brand = brand;
    }

    public String getSound() {
        return "vroom";
    }
}
