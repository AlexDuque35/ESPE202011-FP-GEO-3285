package ec.edu.espe;

/**
 *
 * @author AlexanderDuque
 */
public class MatrixOperations {

    public static float[][] addTwoMatrices(int m, int n, float[][] A, float[][] B) {
        float[][] C;
        C = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Matrix C is ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + C[i][j]);
            }
        }

        return C;
    }

    public static float[][] subtractTwoMatrices(int m, int n, float[][] A, float[][] B) {
        float[][] D;
        D = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                D[i][j] = A[i][j] - B[i][j];
            }
        }

        System.out.println("Matrix D is ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + D[i][j]);
            }
        }
        return D;
    }

    public static float[][] multiplyTwoMatrices(int m, int n, float[][] A, float[][] B) {

        float[][] E;
        int sum = 0;

        E = new float[m][n];
        for (int i = 0; i < B[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                for (int k = 0; k < A[0].length; k++) {

                    sum += A[k][k] * B[k][k];
                }
                E[j][j] = sum;
            }
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println("");
            for (int j = 0; j < B[0].length; j++) {
                System.out.print("\t" + E[i][j]);
            }
        }
        return E;
    }
}
