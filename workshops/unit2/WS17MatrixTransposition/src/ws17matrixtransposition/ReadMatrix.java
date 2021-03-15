package ws17matrixtransposition;

import java.util.Scanner;

/**
 *
 * @author AlexanderDuque
 */
public class ReadMatrix {

    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("--Row Numbers" + (i + 1) + "--");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "][" + (j + 1) + "] ->");
                matrix[i][j] = input.nextFloat();
            }

            System.out.println("Matrix is ");
            for (int i = 0; i < m; i++) {
                System.out.println("");
                for (int j = 0; j < n; j++) {
                    System.out.print("\t" + matrix[i][j]);
                }
                return matrix;
            }

        }
