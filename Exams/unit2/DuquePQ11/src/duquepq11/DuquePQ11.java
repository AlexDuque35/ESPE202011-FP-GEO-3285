package duquepq11;

import java.util.Scanner;

/**
 *
 * @author AlexanderDuque
 */
public class DuquePQ11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("2. Matrix Averague ");

        int valuesToSum = 3;
        float averague[];
        float finalAverague;

        averague = new float[valuesToSum];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the values to averague # " + (i + 1) + " -> ");
            averague[i] = input.nextFloat();
        }

        for (float values : averague) {
            System.out.println("Values are " + values);
        }
        finalAverague = computeAverague(averague);

        System.out.println("Averigue of this values " + averague[0] + averague[1] + averague[2] + " is equal to " + finalAverague);

        int values[] = {12, 23, 34, 98, 87, 65, 0};
        double option;

        System.out.println(
                "Enter a number");
        option = input.nextInt();

        if (option == 12) {
            System.out.println("This number is on Matrix");
        } else {
            if (option == 23) {
                System.out.println("This number is on Matrix");
            } else {
                if (option == 34) {
                    System.out.println("This number is on Matrix");
                } else {
                    if (option == 98) {
                        System.out.println("This number is on Matrix");
                    } else {
                        if (option == 87) {
                            System.out.println("This number is on Matrix");
                        } else {
                            if (option == 65) {
                                System.out.println("This number is on Matrix");
                            } else {
                                if (option == 0) {
                                    System.out.println("This number is on Matrix");
                                } else {
                                    System.out.println("Your number is not in the matrix");
                                }

                            }
                        }

                    }

                }

            }
        }

        int number = 0;
        float[] value;
        float sum = 0.0F;

        System.out.println(
                "Welcome User");

        value = new float[number];

        for (int i = 0;
                i < 5; i++) {
            System.out.print(" Please Enter the number # " + (i + 1) + " -> ");
            value[i] = input.nextInt();

            System.out.println("Values are" + value[i]);

            sum = addNumbers(value);
            System.out.println("The sum is equal to --> " + sum);

        }
    }

    public static float computeAverague(float[] averague) {
        float finalAverague;
        finalAverague = ((averague[0] + averague[1] + averague[2])) / 3;
        return finalAverague;
    }

    public static float addNumbers(float[] value) {
        float sum;
        sum = (value[0] + value[1] + value[2] + value[3] + value[4]);
        return sum;
    }
}
