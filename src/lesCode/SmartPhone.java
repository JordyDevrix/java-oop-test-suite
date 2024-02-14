package lesCode;

public class SmartPhone extends Device {

    private String batteryType;

    public SmartPhone(String brand, String name, String batteryType) {
        super(brand, name);
        this.batteryType = batteryType;
    }

    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Batterytype is: " + this.batteryType);
    }

}
