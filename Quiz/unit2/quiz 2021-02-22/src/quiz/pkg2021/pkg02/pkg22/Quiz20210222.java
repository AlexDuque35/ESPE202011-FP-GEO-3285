package quiz.pkg2021.pkg02.pkg22;

import java.util.Scanner;

/**
 *
 * @author AlexanderDuque
 */
public class Quiz20210222 {

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("================\n *** HARDWARE STORE *** \n Press one (1) to start \n Press zero (0) to exit \n ================");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            int[] products;
            String[] productsStock = {"Hammer", "Keys", "Screwdriver", "Nail",
                "Screw", "Concret", "Paint", "Pipes", "Tape Measure"};
            float productsValue = 0.0F;
            int n;

            System.out.println("Enter the number of products that you would to buy");
            n = input.nextInt();

            products = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter the product name " + (i + 1) + " -> ");
                products[i] = input.nextInt();
            }

            for (int i = 0; i < n; i++) {
                System.out.print("Enter the value of product" + (i + 1) + " in USD $ " + " -> ");
                products[i] = (int) input.nextFloat();
            }
            for (int product : products) {
                System.out.println("Products that you buy are " + product);
            }

            for (String productStock : productsStock) {
                System.out.println("Products on stock are -> " + productStock);
            }
        } while (option != 0);
    }
}
