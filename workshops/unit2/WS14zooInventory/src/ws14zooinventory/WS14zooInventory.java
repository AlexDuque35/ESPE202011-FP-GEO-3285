package ws14zooinventory;

import java.util.Scanner;

/**
 *
 * @author AlexanderDuque
 */
public class WS14zooInventory {

    public static void main(String[] args) {

        final float PI = 3.1416F;
        final float g = 9.81F;

        System.out.println("PI is " + PI);
        System.out.println("Eart's gravity is: " + g);

        int[] eggsByCoop;
        String[] chickens  = {"Lucy", "Maruja", "Pepita"};;
        float[] weightsByCoop;
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of coops -> ");
        n = input.nextInt();

        eggsByCoop = new int[n];
        //chickens = new String[20];
        weightsByCoop = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of eggs of the coop " + (i + 1) + " -> ");
            eggsByCoop[i] = input.nextInt();
        }

        for (int eggs : eggsByCoop) {
            System.out.println("egss of coop are " + eggs);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("eggs of the coop " + (i + 1) + " -> " + eggsByCoop[i]);
        }

        for (String chicken : chickens) {
            System.out.println("chicken name -> " + chicken);
        }

        for (int i = 0; i < weightsByCoop.length; i++) {
            System.out.println("weight of coop " + (i + 1) + " -> " + weightsByCoop[i]);
        }
    }

}
