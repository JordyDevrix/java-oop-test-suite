package lesCode;

public class Device {

    private String brand;

    private String name;

    public Device(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public void DisplayInfo() {
        System.out.println("name: " + name);
        System.out.println("brand: " + brand);
    }

}
