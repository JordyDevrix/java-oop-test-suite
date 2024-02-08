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

        System.out.println(productFour);
        // Adding 4 random products to "Products database"
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(productOne);   // 1
        products.add(productTwo);   // 2
        products.add(productThree); // 3
        products.add(productFour);  // 4

        // Creating shoppingcarts list
        ArrayList<WinkelWagen> winkelWagens = new ArrayList<WinkelWagen>();

        // Creating my own shopping cart and giving it a name
        WinkelWagen mijnWagen = new WinkelWagen("Devrix");

        // Creating scanner
        Scanner input = new Scanner(System.in);

        // Adding 3 random products to my own shoppingcart
        mijnWagen.addProduct(productOne.getProductBarcode());   // 1
        mijnWagen.addProduct(productFour.getProductBarcode());  // 2
        mijnWagen.addProduct(productFour.getProductBarcode());  // 3

        // Adding 1st custom product
        String barcode1 = input.nextLine();
        mijnWagen.addProduct(barcode1);  // 1

        // Adding 2nd custom product
        String barcode2 = input.nextLine();
        mijnWagen.addProduct(barcode2);  // 2

        // Checking the barcodes inside my shopping cart
        System.out.println(mijnWagen.viewWinkelWagen());


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

        mijnWagen.removeProduct("8718452123456");

        // SHOWING SHOPPINGCART AFTER REMOVING CONTENTS
        // First forloop going through all my products
        indx1 = 0;
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
    }
}
