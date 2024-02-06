// JAVA CODE ALONG 06-02-2024
package classExample;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world\n");

        ArrayList<Car> cars = new ArrayList<Car>();

        Car myNewCar = new Car("AB-CD-12", "Volvo", "Devrix");
        Car someonesNewCar = new Car("EF-12-34", "BMW", "Someone");
        Car hisNewCar = new Car("CL-90-CD", "Mercedes", "Him");

        someonesNewCar.setOwner("Vincent");

        System.out.println(myNewCar.getCarData() + "\n" + someonesNewCar.getCarData() + "\n");

        cars.add(myNewCar);
        cars.add(someonesNewCar);
        cars.add(hisNewCar);

        for (Car car : cars) {
            System.out.println(car.getCarData());
        }

    }

}
