package InterfaceKlasLes;

import AbstractKlasLes.Trainable;

public class Intern extends Employee implements Trainable {

    public Intern(int id, String name) {
        super(id, name);
    }

    @Override
    public void executeTask() {
        System.out.println("Haalt koffie en moet dingen leren.");
    }

    public void startTraining() {
        System.out.printf("%s: Basic springboot training.\n", getName());
    }

}
