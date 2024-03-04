package AbstractKlasLes;

import vidcolSuperKlas.Employee;

public class Developer extends Employee {

    public Developer(int id, String name) {
        super(id, name);
    }

    public void executeTask() {
        System.out.println("Software reviewen, schrijven en testen");
    }
}
