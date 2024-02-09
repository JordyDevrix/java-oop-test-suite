package bestandLezen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("src/bestandLezen/helloworld.txt");
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("bestand niet gevonden");
        }

        try {
            FileWriter fileWriter = new FileWriter("src/bestandLezen/helloworld.txt", false);
            for (int fois = 0; fois < 10; fois++) {
                fileWriter.append("hello\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("bestand niet gevonden");
        }
    }

}


