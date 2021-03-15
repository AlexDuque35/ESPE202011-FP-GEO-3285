package Utills;

import java.util.Scanner;

/**
 *
 * @author AlexanderDuque
 */
public class ReadMatrix {

    public static float[][] readMatrixElementsA(int m, int n, Scanner input) {
        float[][] A;
        A = new float[m][n];
        System.out.println("Enter the matrix A values");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("");
                System.out.println("Enter the A[" + (i + 1) + "][" + (j + 1) + "] = ");
                A[i][j] = input.nextInt();
            }
        }
        return A;
    }

    public static float[][] readMatrixElementsB(int m, int n, Scanner input) {
        float[][] B;
        B = new float[m][n];
        System.out.println("Enter the matrix B values");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("");
                System.out.println("Enter the B[" + (i + 1) + "][" + (j + 1) + "] = ");
                B[i][j] = input.nextInt();
            }
        }
        return B;
    }
}
