package vidcolSuperKlas;


/*
    Employee class is a super class that provides information for all other classes,
    that share a relation between the super class.

    A superclass cannot be deleted else the relational class will not receive its information
*/
public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
