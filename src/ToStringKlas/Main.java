package ToStringKlas;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine("Dolce", 210, false);
        System.out.println(coffeeMachine);
        coffeeMachine.addBeans(20);
        System.out.println(coffeeMachine);
    }

}
