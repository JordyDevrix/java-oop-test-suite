package InterfaceKlasLes;

import AbstractKlasLes.Trainable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Developer jan = new Developer(4132, "Jan");
        Manager joost = new Manager(4132, "Joost Klein", "IT");
        Intern jaap = new Intern(1233, "Jaap");

        ArrayList<Employee> employeeList = new ArrayList<>();
        ArrayList<Trainable> trainingList = new ArrayList<>();

        trainingList.add(jan);
        trainingList.add(jaap);

        employeeList.add(jan);
        employeeList.add(joost);

        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
            employee.executeTask();
        }

        for (Trainable trainable : trainingList) {
            trainable.startTraining();
        }
    }
}
