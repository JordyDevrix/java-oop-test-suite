package vidcolSuperKlas;

public class Manager extends Employee {
    private String department;
    public Manager(String department, int id, String name) {
        super(id, name);
        this.department = department;
    }
    public void executeTask() {
        System.out.println("Plannen en gesprekken voeren");
    }
    public String getDepartment() {
        return department;
    }
}
