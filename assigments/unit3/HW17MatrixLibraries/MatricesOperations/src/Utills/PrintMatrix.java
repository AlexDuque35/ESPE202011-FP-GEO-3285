package Utills;

/**
 *
 * @author AlexanderDuque
 */
public class PrintMatrix {

    public static void printMatrixA(int m, int n, float[][] A) {
        System.out.println("Matrix A is ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + A[i][j]);
            }
        }
    }

    public static void printMatrixB(int m, int n, float[][] B) {
        System.out.println("Matrix B is ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + B[i][j]);
            }
        }
    }
}
