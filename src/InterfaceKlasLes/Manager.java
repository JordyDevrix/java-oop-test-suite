package InterfaceKlasLes;

public class Manager extends Employee {
    private String department;
    public Manager(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    @Override
    public void executeTask() {
        System.out.println("Plannen en gesprekken voeren.");
    }

    public String getDepartment() {
        return department;
    }
}
