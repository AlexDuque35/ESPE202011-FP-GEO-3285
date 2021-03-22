package hw16matrixfunctions;

import java.util.Scanner;

/**
 *
 * @author AlexanderDuque
 */
public class HW16MatrixFunctions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float[][] A;
        float[][] B;
        float[][] C;
        int m = 0;
        int n = 0;
        System.out.println("MATRIX SUBTRACTION");
        System.out.println("MATRIX A");
        System.out.println("Enter the matrix dimesions");
        System.out.println("Enter the rows Number->");
        n = input.nextInt();
        System.out.println("Enter the columns number->");
        m = input.nextInt();
        
        A = new float[m][n];
        B = new float[m][n];
        C = new float[m][n];

        System.out.println("Enter the elements of the matrix");

        A = readMatrixElements(m, n, "A", input);
        B = readMatrixElements(m, n, "B", input);

        for (int tab = 0; tab <= n / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println(" A");

        prettyPrintMatrix(m, n, A);
        System.out.println("");

        System.out.println(" B ");
        prettyPrintMatrix(m, n, A);

        System.out.println("--The difference of matrices is--");

        C = subtractTwoMatrices(m, n, A, B);
        prettyPrintMatrix(m, n, A);
    }

    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("--Row Numbers" + (i + 1) + "--");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "][" + (j + 1) + "] ->");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

    public static float[][] subtractTwoMatrices(int m, int n, float[][] A, float[][] B) {
        float[][] C;
        C = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }

    public static void prettyPrintMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("┌ \t");
                    } else if (i == m - 1) {
                        System.out.print("└\t");

                    } else {
                        System.out.print("│\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print(" \t┐");
                    } else if (i == m - 1) {
                        System.out.print(" \t┘");

                    } else {
                        System.out.print("  \t│");
                    }
                }
            }
        }
        System.out.println("");
    }


    public static void printMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.println("\t");
                    } else if (i == m - 1) {
                        System.out.println("\t");

                    } else {
                        System.out.println("\t");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.println("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.println("\t");
                    } else if (i == m - 1) {
                        System.out.println("\t");

                    } else {
                        System.out.println("\t");
                    }
                }
            }
        }
        System.out.println("");

    }

}
