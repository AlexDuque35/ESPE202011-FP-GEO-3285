package modularitycalculator;

import java.util.Scanner;
import util.BasicOperators;

/**
 *
 * @author AlexaanderDuque
 */
public class ModularityCalculator {

    public static void main(String[] args) {

        float number1;
        float number2;
        float result;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome User \n Give me a value");
        number1 = input.nextFloat();
        System.out.println("Give me another value");
        number2 = input.nextFloat();

        result = BasicOperators.addTwoNumbers(number1, number2);
        System.out.println("The addition between " + number1 + " + " + number2 + " is equal to --> " + result);
        result = BasicOperators.subtractTwoNumbers(number1, number2);
        System.out.println("The subtraction between " + number1 + " - " + number2 + " is equal to --> " + result);
        result = BasicOperators.multiplyTwoNumbers(number1, number2);
        System.out.println("The multiply between " + number1 + " * " + number2 + " is equal to --> " + result);
        result = BasicOperators.divideTwoNumbers(number1, number2);
        System.out.println("The division between " + number1 + " / " + number2 + " is equal to --> " + result);
        
    }

}
