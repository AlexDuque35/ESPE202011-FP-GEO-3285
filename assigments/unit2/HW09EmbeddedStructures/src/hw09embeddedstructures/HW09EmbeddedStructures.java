package hw09embeddedstructures;

import java.util.Scanner;

/**
 *
 * @author aduque
 */
public class HW09EmbeddedStructures {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        System.out.println("Enter the First Value");
        int scanner1 = e.nextInt();

        System.out.println("Enter the Second Value");
        int scanner2 = e.nextInt();

        if (scanner1 % 2 == 0) {
            System.out.println("The number " + scanner1 + " Is Divisible for 2. \n");
            System.out.println("The number " + scanner2 + " Is Divisible for 2. \n");
            int multiplicand = scanner1;
            int multiplier = scanner2;
            int product;

            product = multiplicand * multiplier;
            System.out.println("So " + multiplicand + "*" + multiplier + "=" + product);
        }

        if (scanner1 % 3 == 0) {
            System.out.println("The number " + scanner1 + " Is Divisible for 3. \n");
            System.out.println("The number " + scanner2 + " Is Divisible for 3. \n");
            int addend1 = scanner1;
            int addend2 = scanner2;
            int sum;

            sum = addend1 + addend2;
            System.out.println("So " + addend1 + "+" + addend2 + "=" + sum);
        }

        if (scanner1 % 7 == 0) {
            System.out.println("The number " + scanner1 + " Is Divisible for 7. \n");
            System.out.println("The number " + scanner2 + " Is Divisible for 7. \n");
            int dividend = scanner1;
            int divisor = scanner2;
            int remainder;

            remainder = dividend % divisor;
            System.out.println("So " + dividend + "%" + divisor + "=" + remainder);
        }

        if (scanner1 % 11 == 0) {
            System.out.println("The number " + scanner1 + " Is Divisible for 11. \n");
            System.out.println("The number " + scanner2 + " Is Divisible for 11. \n");
            System.out.println("====== MULTIPLICATION : 11 ======");

            int top = 12;
            int product = 0;
            int table = 11;

            for (int j = 1; j <= top; j++) {
                product = table * j;
                System.out.println("11 * " + j + " = " + product);
            }
        }

        if (scanner1 % 13 == 0) {
            System.out.println("The number " + scanner1 + " Is Divisible for 13. \n");
            System.out.println("The number " + scanner2 + " Is Divisible for 13. \n");
            int dividend = scanner1;
            int divisor = scanner2;
            int quotient;

            quotient = dividend / divisor;
            System.out.println("So " + dividend + "/" + divisor + "=" + quotient);
        
        }
    }
}
