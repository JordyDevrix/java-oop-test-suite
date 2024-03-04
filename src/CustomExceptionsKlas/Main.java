package CustomExceptionsKlas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        String name = input.nextLine();

        try {
            Person myUser = new Person(age, name);
            System.out.println(myUser);
        } catch (ToYoungPersonException e) {
            System.out.println("age cannot be lower than 0");
        }

    }
}
