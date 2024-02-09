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
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("bestand niet gevonden");
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("src/bestandLezen/helloworld.txt", false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            for (int fois = 0; fois < 10; fois++) {
                fileWriter.append("hello\n");
            }
        } catch (IOException e) {
            System.out.println("bestand niet gevonden");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("printen niet gelukt");
            }
        }
    }

}


