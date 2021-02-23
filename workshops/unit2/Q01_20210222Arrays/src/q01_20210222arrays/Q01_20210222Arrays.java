package q01_20210222arrays;

import java.util.Scanner;

/**
 *
 * @author AlexanderDuque
 */
public class Q01_20210222Arrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("========================\n *** HARDWARE STORE *** \n Press one (1) to start \n Press zero (0) to exit \n =======================");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    int products = 0;
                    String[] productsNames;
                    float[] productsValue;

                    productsNames = new String[products];
                    productsValue = new float[products];

                    System.out.println("Enter the number of products that you would to buy");
                    products = scanner.nextInt();

                    for (int i = 0; i < products; i++) {
                        scanner.nextLine();
                        System.out.print("Enter the product name " + (i + 1) + " -> ");
                        productsNames[i] = scanner.nextLine();
                        System.out.print("Enter the value of product" + productsNames[i] + " in USD $ " + " -> ");
                        productsValue[i] = scanner.nextFloat();
                    }
                    System.out.println("Product name: \t Product value $: ");

                    for (int i = 0; i < products; i++) {
                        System.out.println(productsNames[i] + "-> \t " + productsValue[i]);
                    }
                    break;
                case 0:
                    System.out.println("Thnks for using my software \n Good Bye");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }

        } while (option != 0);
    }
}
