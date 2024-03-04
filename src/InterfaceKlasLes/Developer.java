package InterfaceKlasLes;

import AbstractKlasLes.Trainable;

public class Developer extends Employee implements Trainable {

    public Developer(int id, String name) {
        super(id, name);
    }

    @Override
    public void executeTask() {
        System.out.println("Software reviewen, schrijven en testen.");
    }

    public void startTraining() {
        System.out.printf("%s: Advanced springboot training.\n", getName());
    }
}
