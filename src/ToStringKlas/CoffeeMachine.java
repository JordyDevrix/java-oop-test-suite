package ToStringKlas;

public class CoffeeMachine {

    private String brand = "Douwe Egberts";
    private int beansAmount = 20;
    private boolean isCurrentlyRunning = false;

    public CoffeeMachine(String brand, int beansAmount, boolean isCurrentlyRunning) {
        this.brand = brand;
        this.beansAmount = beansAmount;
        this.isCurrentlyRunning = isCurrentlyRunning;
    }

    @Override
    public String toString() {
        return String.format("""
                brand: %s
                amount of beans left: %s
                is running: %s""",
                this.brand, this.beansAmount, this.isCurrentlyRunning);
    }

    public void addBeans(int beans) {
        this.beansAmount += beans;
    }
}
