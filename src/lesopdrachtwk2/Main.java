package lesopdrachtwk2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valueA = input.nextInt();
        int valueB = input.nextInt();

        Calculator calculate = new Calculator(valueA, valueB);

        try {
            System.out.println(calculate.Devide());
        } catch (ArithmeticException e) {
            System.out.println("ArithmaticException: \n" + e.getMessage());
        }
    }

}
