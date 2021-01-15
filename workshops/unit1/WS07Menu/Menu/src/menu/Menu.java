package menu;
2.
import java.util.Scanner;
/**
 *
 * @author aduqu
 */
public class Menu {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Addition");
            System.out.println("2. -> Subtraction");
            System.out.println("3. -> Multiplication");
            System.out.println("4. -> Division");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    addend2 = input.nextInt();
                    sum = addend1 + addend2;
                    System.out.println(" the sum is --> " + sum);
                    break;
                case 2:
                    int difference;
                    int minuend;
                    int subtrahend;
                    System.out.println("enter minuend -> ");
                    minuend = input.nextInt();
                    System.out.println("enter subtrahend -> ");
                    subtrahend = input.nextInt();
                    difference = minuend - subtrahend;
                    System.out.println(" the difference is --> " + difference);
                    System.out.println("The subtraction is");
                    break;
                case 3:
                    System.out.println("The multiplcation is");
                    int product;
                    int multiplier;
                    int multiplicant;
                    System.out.println("enter multiplier -> ");
                    multiplier = input.nextInt();
                    System.out.println("enter multiplicant -> ");
                    multiplicant = input.nextInt();
                    product = multiplicant * multiplier;
                    System.out.println(" the product is --> " + product);
                    break;
                case 4:
                    System.out.println("The division is");
                    int quotient;
                    int divisor;
                    int dividend;
                    System.out.println("enter divisor -> ");
                    divisor = input.nextInt();
                    System.out.println("enter dividend -> ");
                    dividend = input.nextInt();
                    quotient = dividend / divisor;
                    System.out.println(" the quotient is --> " + quotient);
                    break;
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}