package vidcolSuperKlas;

public class Main {

    public static void main(String[] args) {
        Developer dvrx = new Developer(4132, "Jordy Devrix");
        System.out.println(dvrx.getId());
        dvrx.executeTask();

        Manager devrix = new Manager(4132, "ma men", "IT");
        devrix.executeTask();
    }

}
