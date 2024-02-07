package kassaSysteem;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        //INITIALISING "DATABASES"
        // Creating random products
        Product productOne = new Product("8718452123456", "Coca Cola", "Zero");
        Product productTwo = new Product("8718452654321", "Coca Cola", "Cherry");
        Product productThree = new Product("8718452162534", "Coca Cola", "Regular");
        Product productFour = new Product("8718452112233", "Mercedes", "GLS");

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

        // Adding 5 random products to my own shoppingcart
        mijnWagen.addProduct(productOne.getID());   // 1
        mijnWagen.addProduct(productThree.getID()); // 2
        mijnWagen.addProduct(productFour.getID());  // 3
        mijnWagen.addProduct(productFour.getID());  // 4
        mijnWagen.addProduct(productTwo.getID());   // 5

        // Checking the barcodes inside my shopping cart
        System.out.println(mijnWagen.viewWinkelWagen());


        // SHOWING SHOPPINGCART CONTENTS
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
                if (Objects.equals(item.getID(), product)) {
                    System.out.println(products.get(indx2).getProduct());
                }
                indx2++;
            }
            indx1++;
        }
    }
}
