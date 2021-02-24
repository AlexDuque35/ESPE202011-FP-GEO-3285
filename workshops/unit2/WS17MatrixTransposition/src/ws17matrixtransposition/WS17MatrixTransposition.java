package ws17matrixtransposition;

import java.util.Scanner;

/**
 *
 * @author AlexanderDuque
 */
public class WS17MatrixTransposition {

    public static void main(String[] args) {

        float[][] A;
        float[][] B;
        float[][] t;
        float[][] C;
        int m = 0;
        int n = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the matrix dimesions");
        System.out.println("\n Columns Number->");
        m = input.nextInt();

        System.out.println("\n Rows Number->");
        n = input.nextInt();

        A = new float[m][n];
        B = new float[m][n];
        C = new float[m][n];
        t = new float[n][m];

        System.out.println("------Enter the elements of the matrix-------");

        A = readMatrixElements(m, n, "A", input);
        B = readMatrixElements(m, n, "B", input);

        for (int tab = 0; tab <= n / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println(" A");

        printMatrix(m, n, A);
        System.out.println("");

        System.out.println(" B ");
        printMatrix(m, n, B);

        transpose(n, m, t, A);

        for (int tab = 0; tab <= n / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println(" T");
        printMatrix(m, n, t);

        System.out.println("--The sum of matrices is--");

        C = addTwoMatrices(m, n, A, B);
        printMatrix(m, n, C);
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

    public static void transpose(int n, int m, float[][] t, float[][] a) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = a[j][i];
            }
        }
    }

    public static float[][] addTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void prettyPrintMatrix(int m, int n, float[][] matrix) {
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
