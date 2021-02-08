package hw11recursion;

import java.util.Scanner;

/**
 *
 * @author aduqu
 */
public class HW11Recursion {

    public static void main(String[] args) {
        int top = 0;
        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       Welcome user                     *\n"
                + " *  Please enter the terms numbers of this series  --->   *\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");
        Scanner input = new Scanner(System.in);
        top = input.nextInt();

        for (int i = 0; i <= top - 1; i++) {
            System.out.println("The Fibonacci Series is: " + calculateAFibonacciSeries(i));
        }

        int Permutation = 1;
        int permutation2 = 1;
        int totalObjects;
        int selectedObjects;

        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       User                             *\n"
                + " *  Please enter the total objects number  --->    *\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");
        Scanner input2 = new Scanner(System.in);
        totalObjects = input.nextInt();

        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       User                             *\n"
                + " *  Please enter the selected objects number  --->        *\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");
        Scanner input3 = new Scanner(System.in);
        selectedObjects = input.nextInt();

        permutation2 = (totalObjects - selectedObjects);
        calculateAPermutation(totalObjects, selectedObjects, permutation2);

    }

    public static void calculateAPermutation(int totalObjects, int selectedObjects, int permutation2) {
        int Permutation;

        Permutation = (calculeFactorialTotalObjects(totalObjects)) / (calculateFactorialPermutation2(permutation2));
        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       User                             *\n"
                + " *        The Permutation of " + totalObjects + " and " + selectedObjects + "                 *\n"
                + " *        is equal to ---> " + Permutation + "                              *\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");
    }

    public static int calculateAFibonacciSeries(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return calculateAFibonacciSeries(n - 1) + calculateAFibonacciSeries(n - 2);
        }

    }

    public static int calculeFactorialTotalObjects(int totalObjects) {
        if (totalObjects < 0) {
            return -1;
        } else {
            if (totalObjects == 0) {
                return 1;
            } else {
                return (totalObjects * calculeFactorialTotalObjects(totalObjects - 1));
            }
        }
    }

    public static int calculateFactorialSelectedObjects(int selectedObjects) {
        if (selectedObjects < 0) {
            return -1;
        } else {
            if (selectedObjects == 0) {
                return 1;
            } else {
                return (selectedObjects * calculateFactorialSelectedObjects(selectedObjects - 1));
            }
        }
    }

    public static int calculateFactorialPermutation2(int permutation2) {
        if (permutation2 < 0) {
            return -1;
        } else {
            if (permutation2 == 0) {
                return 1;
            } else {
                return (permutation2 * calculateFactorialSelectedObjects(permutation2 - 1));
            }
        }
    }

}
