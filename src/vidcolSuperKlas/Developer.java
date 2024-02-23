package vidcolSuperKlas;

public class Developer {
    private int id;
    private String name;

    public Developer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void executeTask() {
        System.out.println("Software reviewen, schrijven en testen");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
