package ws16bidimensionalarray;

/**
 *
 * @author AlexanderDuque
 */
public class WS16BidimensionalArray {

    public static void main(String[] args) {

        int a[][] = {{5, 7, 9}, {9, 5, 8}, {3, 2, 4}};
        int b[][] = {{8, 3, 5}, {-5, 4, -3}, {9, 10, 24}};
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("The additon of matrix A -> ");

        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + a[i][j]);
            }
        }

        System.out.println("\nAnd Matrix B -> ");
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + b[i][j]);
            }
        }

        System.out.println("\nequals to -> ");
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }

    }

}
