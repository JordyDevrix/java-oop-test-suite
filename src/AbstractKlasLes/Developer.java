package AbstractKlasLes;

public class Developer extends Employee {

    public Developer(int id, String name) {
        super(id, name);
    }

    @Override
    public void executeTask() {
        System.out.println("Software reviewen, schrijven en testen");
    }
}
