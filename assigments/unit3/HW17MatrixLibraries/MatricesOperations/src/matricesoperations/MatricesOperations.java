package matricesoperations;

import Utills.PrintMatrix;
import Utills.ReadMatrix;
import ec.edu.espe.MatrixOperations;
import java.util.Scanner;

/**
 *
 * @author AlexanderDuque
 */
public class MatricesOperations {

    public static void main(String[] args) {

        float[][] A;
        float[][] B;
        float[][] C;
        float[][] D;
        float[][] E;
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
        D = new float[m][n];
        E = new float[m][n];

        System.out.println("------Enter the elements of the matrix-------");

        A = ReadMatrix.readMatrixElementsA(m, n, input);
        PrintMatrix.printMatrixA(m, n, A);
        System.out.println("\n");
        B = ReadMatrix.readMatrixElementsB(m, n, input);
        PrintMatrix.printMatrixB(m, n, B);
        System.out.println("\n");

        System.out.println("--The sum of matrices is--");
        MatrixOperations.addTwoMatrices(m, n, A, B);
        System.out.println("\n");
        System.out.println("--The difference of matrices is--");
        MatrixOperations.subtractTwoMatrices(m, n, A, B);
        System.out.println("\n");
        System.out.println("--The product of matrices is--");
        MatrixOperations.multiplyTwoMatrices(m, n, A, B);
        System.out.println("\n");
    }
}
