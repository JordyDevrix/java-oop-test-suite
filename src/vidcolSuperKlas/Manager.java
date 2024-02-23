package vidcolSuperKlas;

public class Manager {
    private int id;
    private String name;
    private String department;

    public Manager(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void executeTask() {
        System.out.println("Plannen en gesprekken voeren");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
