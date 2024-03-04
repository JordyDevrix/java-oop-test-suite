package AbstractKlasLes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Developer jan = new Developer(4132, "Jan");
        Manager joost = new Manager(4132, "Joost Klein", "IT");

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(jan);
        employeeList.add(joost);

        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
            employee.executeTask();
        }
    }
}
