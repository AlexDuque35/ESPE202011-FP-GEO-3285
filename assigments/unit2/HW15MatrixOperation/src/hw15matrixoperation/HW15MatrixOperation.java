package hw15matrixoperation;

import java.util.Scanner;

/**
 *
 * @author AlexanderDuque
 */
public class HW15MatrixOperation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = 0;
        int n = 0;
        int[][] A;
        int[][] B;
        int[][] C;
        System.out.println("MATRIX SUBTRACTION");
        System.out.println("MATRIX A");
        System.out.println("Enter the rows number");
        n = input.nextInt();
        System.out.println("Enter the columns number");
        m = input.nextInt();

        A = new int[m][n];

        System.out.println("Enter the Matrix Elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("a[" + (i + 1) + "][" + (j + 1) + "] --> ");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("MATRIX A");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t " + A[i][j]);
            }
        }

        System.out.println("MATRIX B");
        System.out.println("Enter the rows number");
        n = input.nextInt();
        System.out.println("Enter the columns number");
        m = input.nextInt();

        B = new int[m][n];

        System.out.println("Enter the Matrix Elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("b[" + (i + 1) + "][" + (j + 1) + "] --> ");
                B[i][j] = input.nextInt();
            }
        }

        System.out.println("MATRIX B");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t " + B[i][j]);
            }
        }

        C = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        System.out.println("\n MATRIX C is equal to --> ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t " + C[i][j]);
            }
        }
    }
}
