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

            Product(multiplicand, multiplier);
        }

        if (scanner1 % 3 == 0) {
            System.out.println("The number " + scanner1 + " Is Divisible for 3. \n");
            System.out.println("The number " + scanner2 + " Is Divisible for 3. \n");
            int addend1 = scanner1;
            int addend2 = scanner2;
            int sum;

            Sum(addend1, addend2);
        }

        if (scanner1 % 7 == 0) {
            System.out.println("The number " + scanner1 + " Is Divisible for 7. \n");
            System.out.println("The number " + scanner2 + " Is Divisible for 7. \n");
            int dividend = scanner1;
            int divisor = scanner2;
            int remainder;

            Remainde(dividend, divisor);
        }

        if (scanner1 % 11 == 0) {
            System.out.println("The number " + scanner1 + " Is Divisible for 11. \n");
            System.out.println("The number " + scanner2 + " Is Divisible for 11. \n");
            System.out.println("====== MULTIPLICATION : 11 ======");

            int top = 12;
            int product = 0;
            int table = 11;

            PrintMultiplicandTable(top, table);
        }

        if (scanner1 % 13 == 0) {
            System.out.println("The number " + scanner1 + " Is Divisible for 13. \n");
            System.out.println("The number " + scanner2 + " Is Divisible for 13. \n");
            int dividend = scanner1;
            int divisor = scanner2;
            int quotient;

            DivideTwoNumber(dividend, divisor);
        
        }
    }

    public static void DivideTwoNumber(int dividend, int divisor) {
        int quotient;
        quotient = dividend / divisor;
        System.out.println("So " + dividend + "/" + divisor + "=" + quotient);
    }

    public static void PrintMultiplicandTable(int top, int table) {
        int product;
        for (int j = 1; j <= top; j++) {
            product = table * j;
            System.out.println("11 * " + j + " = " + product);
        }
    }

    public static void Remainde(int dividend, int divisor) {
        int remainder;
        remainder = dividend % divisor;
        System.out.println("So " + dividend + "%" + divisor + "=" + remainder);
    }

    public static void Sum(int addend1, int addend2) {
        int sum;
        sum = addend1 + addend2;
        System.out.println("So " + addend1 + "+" + addend2 + "=" + sum);
    }

    public static void Product(int multiplicand, int multiplier) {
        int product;
        product = multiplicand * multiplier;
        System.out.println("So " + multiplicand + "*" + multiplier + "=" + product);
    }
}
