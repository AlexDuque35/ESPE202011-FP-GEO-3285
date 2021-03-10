package escobarpq11;

import java.util.Scanner;

public class EscobarPQ11 {

    public static void main(String[] args) {

        printBannerExcersice();

        Scanner inside = new Scanner(System.in);
        System.out.println("What´s the range of the matrixes");
        int rank = inside.nextInt();

        int matrix_one[][] = new int[rank][rank];
        int matrix_two[][] = new int[rank][rank];
        int solution[][] = new int[rank][rank];
        int i = 0;
        int j = 0;

        getRowColumns(matrix_one, inside, matrix_two, solution);
        System.out.println("Give the number for the row: " + i + "column" + j + "Of the matrix_one");
        matrix_one[i][j] = inside.nextInt();
        System.out.println("Give the number for the row: " + i + "column" + j + "Of the matrix_two");
        matrix_two[i][j] = inside.nextInt();

        System.out.println("Matrix_one");
        showMatrixes(matrix_one);
        System.out.println("Matrix_two");
        showMatrixes(matrix_two);
        System.out.println("Matrix_solution");
        showMatrixes(solution);

        printBannerSecond();

        Scanner sc = new Scanner(System.in);
        int number_learner;
        double summa = 0, average;

        double[] corses = showStudents(sc, i);

        for (i = 0; i < corses.length; i++) {
            summa = summa + corses[i];
        }

        calculateAverage(summa, corses, i);

        printBannerThird();

        int[] number = new int[7];

        priintArray(number);

        Scanner in = new Scanner(System.in);
        System.out.println("What´s your number");
        int num = in.nextInt();

        printCorrectValue(number, num);

    }

    public static void printBannerSecond() {
        System.out.println("");
        System.out.println("");
        System.out.println("******************");
        System.out.println("*SECOND EXCERSICE*");
        System.out.println("******************");
        System.out.println("");
    }

    public static void printBannerThird() {
        System.out.println("");
        System.out.println("");
        System.out.println("*****************");
        System.out.println("*THREE EXCERSICE*");
        System.out.println("*****************");
        System.out.println("");
    }

    public static void printCorrectValue(int[] number, int num) {
        if (number[0] != num) {
            System.out.println("Wrong number");

        }
    }

    public static void priintArray(int[] number) {
        number[0] = 12;
        number[1] = 23;
        number[2] = 34;
        number[3] = 98;
        number[4] = 87;
        number[5] = 65;
        number[6] = 0;

        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
        System.out.println(number[5]);
        System.out.println(number[6]);
    }

    public static void calculateAverage(double summa, double[] corses, int i) {
        double average;
        average = summa / corses.length;
        System.out.printf("Half corse of the course: %.2f %n", average);
        System.out.println("Roster of the courses: ");
        for (i = 0; i < corses.length; i++) {
            if (corses[i] > average) {
                System.out.println("Number learner " + (i + 1) + " Final Corse: " + corses[i]);
            }
        }
    }

    public static double[] showStudents(Scanner sc, int i) {
        int number_learner;
        do {
            System.out.print("HOW MANY STUDENTS ARE IN THE CLASE: ");
            number_learner = sc.nextInt();
        } while (number_learner <= 0);
        double[] corses = new double[number_learner];
        for (i = 0; i < corses.length; i++) {
            System.out.print("Learner " + (i + 1) + " Final Corse: ");
            corses[i] = sc.nextDouble();
        }
        return corses;
    }

    public static void getRowColumns(int[][] matrix_one, Scanner inside, int[][] matrix_two, int[][] solution) {
        for (int i = 0; i < matrix_one.length; i++) {
            for (int j = 0; j < matrix_one[0].length; j++) {

                solution[i][j] = matrix_one[i][j] + matrix_two[i][j];

            }
        }
    }

    public static void printBannerExcersice() {
        System.out.println("******************************************************************************************");
        System.out.println("*Hi, Edison Lascano, PhD. My name's Paul Escobar in this case I show you my quiz code*");
        System.out.println("******************************************************************************************");
        System.out.println("");

        System.out.println("");
        System.out.println("");
        System.out.println("*****************");
        System.out.println("*FIRST EXCERSICE*");
        System.out.println("*****************");
        System.out.println("");
    }

    public static void showMatrixes(int[][] matrixes) {
        for (int i = 0; i < matrixes.length; i++) {
            for (int j = 0; j < matrixes[0].length; j++) {
                System.out.print(matrixes[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
