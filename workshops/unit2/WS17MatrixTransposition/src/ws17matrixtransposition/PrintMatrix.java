package ws17matrixtransposition;

import java.util.Scanner;

/**
 *
 * @author AlexanderDuque
 */
public class PrintMatrix {

    public static void PrintMatrix(int m, int n) {
        float[][] matrixB;
        matrixB = new float[m][n];
        System.out.println("Matrix B is ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + matrixB[i][j]);

            }
        }
    }
}

