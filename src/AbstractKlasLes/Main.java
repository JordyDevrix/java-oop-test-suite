package AbstractKlasLes;

import vidcolSuperKlas.Developer;
import vidcolSuperKlas.Manager;

public class Main {
    public static void main(String[] args) {
        vidcolSuperKlas.Developer dvrx = new Developer(4132, "Jordy Devrix");
        System.out.println(dvrx.getId());
        dvrx.executeTask();

        vidcolSuperKlas.Manager devrix = new vidcolSuperKlas.Manager(4132, "ma men", "IT");
        devrix.executeTask();

        vidcolSuperKlas.Manager jordy = new Manager(2109, "JORDY DEVRIXXX", "Customer support");
        System.out.println(jordy.getId());


    }
}
