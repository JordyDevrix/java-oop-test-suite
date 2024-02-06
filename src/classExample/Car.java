// JAVA CODE ALONG 06-02-2024
package classExample;

import java.util.ArrayList;
import java.util.Objects;

public class Car {
    // registerNumber carBrand owner kilometersDriven kilometersTillService

    private String registerNumber;
    private String carBrand;
    private String owner;
    private long kilometersDriven;
    private final long kilometersTillService = 30000;

    public Car(String registerNumber, String carBrand, String owner) { // Real values (12-DE-K8 - BMW - someone)
        this.registerNumber = registerNumber;
        this.carBrand = carBrand;
        this.owner = owner;
        this.kilometersDriven = 0;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public String getOwner() {
        return owner;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public ArrayList<String> getCarData() {
        ArrayList<String> car = new ArrayList<String>();
        car.add(registerNumber);
        car.add(carBrand);
        car.add(owner);
        return car;
    }

    public void setOwner(String newOwner) {
        this.owner = newOwner;
    }
}
