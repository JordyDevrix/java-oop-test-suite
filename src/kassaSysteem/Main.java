package kassaSysteem;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //INITIALISING "DATABASES"
        // Creating random products
        Product productOne = new Product("8718452123456", "Coca Cola", "Zero");
        Product productTwo = new Product("8718452654321", "Coca Cola", "Cherry");
        Product productThree = new Product("8718452162534", "Coca Cola", "Regular");
        Product productFour = new Product("8718452112233", "Mercedes", "GLS");

        // Adding 4 random products to "Products database"
        ArrayList<Product> products = new ArrayList<>();
        products.add(productOne);   // 1
        products.add(productTwo);   // 2
        products.add(productThree); // 3
        products.add(productFour);  // 4

        // Creating shoppingcarts list
        ArrayList<WinkelWagen> winkelWagens = new ArrayList<>();

        boolean running = true;

        // Creating my own shopping cart and giving it a name
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Please enter a name:");
        String cartName = nameInput.nextLine();
        WinkelWagen mijnWagen = new WinkelWagen(cartName);

        System.out.printf("\nWelcome %s, ", cartName);

        // creating a while loop so that the program keeps running
        while (running) {
            Scanner input = new Scanner(System.in);

            System.out.println(
                    """
                            Please make a choice:
                            [1] view shopping cart content
                            [2] add product
                            [3] remove product
                            [4] view all the barcodes in my shopping cart
                            [5] stop
                            """
            );

            int choice = input.nextInt();

            if (Objects.equals(choice, 1)) {

                // SHOWING SHOPPINGCART BEFORE REMOVING CONTENTS
                // First forloop going through all my products
                int indx1 = 0;
                for (String product : mijnWagen.viewWinkelWagen()) {
                    int indx2 = 0;
                    /* second forloop going through each product that's available and then checking if it is
                       inside my shoppingcart
                     */
                    for (Product item : products) {
                        // For debugging purposes...
                        // System.out.println(indx2 + " " + item.getID() + product);
                        if (Objects.equals(item.getProductBarcode(), product)) {
                            System.out.println(products.get(indx2).getProductData());
                        }
                        indx2++;
                    }
                    indx1++;
                }

            } else if (Objects.equals(choice, 2)) {

                // adding product
                Scanner scanInput = new Scanner(System.in);
                String barcode = scanInput.nextLine();
                mijnWagen.addProduct(barcode);

            } else if (Objects.equals(choice, 3)) {

                // removing product
                Scanner scanInput = new Scanner(System.in);
                String barcode = scanInput.nextLine();
                mijnWagen.removeProduct(barcode);

            } else if (Objects.equals(choice, 4)) {

                // Checking the barcodes inside my shopping cart
                System.out.println(mijnWagen.viewWinkelWagen());

            } else if (Objects.equals(choice, 5)) {

                System.out.println("Closing...");
                nameInput.close();
                input.close();
                running = false;

            } else {

                System.out.println("This is not an option, please try again.");

            }
        }
    }
}
