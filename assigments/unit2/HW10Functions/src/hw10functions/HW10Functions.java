package hw10functions;

import java.util.Scanner;

/**
 *
 * @author aduqu
 */
public class HW10Functions {

    public static void main(String[] args) {

        int Dividend;
        int Divisor;
        float quotient = 0;
        int InitialValueP;
        int InitialValueG;
        int Multiplicand;
        int Product = 0;
        int ProductTable = 0;
        int ImageP = 0;
        int ImageG = 0;

        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       Welcome user                     *\n"
                + " *       Please enter an integer number to divide  --->   *\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");
        Scanner input = new Scanner(System.in);
        Dividend = input.nextInt();

        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       User                             *\n"
                + " *    Please enter another integer number to divide  ---> *\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");
        Scanner input2 = new Scanner(System.in);
        Divisor = input.nextInt();

        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       User                             *\n"
                + " *Please enter an integer number to calcute: Its square ->*\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");
        Scanner input3 = new Scanner(System.in);
        InitialValueP = input.nextInt();

        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       User                             *\n"
                + " *       Please enter an integer number to calcute:       *\n"
                + " *Its square adding its double product and increase one (1)*\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");
        Scanner input4 = new Scanner(System.in);
        InitialValueG = input.nextInt();

        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       User                             *\n"
                + " *       Please enter an integer number to calcute:       *\n"
                + " *           Its double product until twelve (12)         *\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");
        Scanner input5 = new Scanner(System.in);
        Multiplicand = input.nextInt();

        quotient = divideTwoNumbers(Dividend, Divisor);

        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       User                             *\n"
                + " *                The division between                    *\n"
                + " *   ---> " + Dividend + "                                               *\n"
                + " *                      And                               *\n"
                + " *   ---> " + Divisor + "                                               *\n"
                + " *   is equal to ---> " + quotient + "                                 *\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");

        ImageP = power(InitialValueP);
        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       User                             *\n"
                + " *        The square of " + InitialValueP + "                                 *\n"
                + " *        is equal to ---> " + ImageP + "                             *\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");

        ImageG = Power2(InitialValueG);
        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       User                             *\n"
                + " *The square of " + InitialValueG + " adding its double product and increase 1*\n"
                + " *        is equal to ---> " + ImageG + "                              *\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");

        ProductTable = Multiply(Multiplicand);
        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       User                             *\n"
                + " *           The multiplicacion of " + Multiplicand + " until 12 " + "            *\n"
                + " *            is equal to ---> " + ProductTable + "                          *\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");
       }

    public static float divideTwoNumbers(int Dividend, int Divisor) {

        float quotient = 0.0F;

        quotient = (float) Dividend / (float) Divisor;

        return quotient;
    }

    public static int power(int InitialValueP) {
        int Image = 0;

        Image = InitialValueP * InitialValueP;

        return Image;

    }

    public static int Power2(int InitialValueG) {
        int ImageG = 0;

        ImageG = InitialValueG * InitialValueG + 2 * InitialValueG + 1;

        return ImageG;

    }

    public static int Multiply(int Multiplicand) {
        int ProductTable = 0;

        for (int n = 1; n <= 12; n++) {

            ProductTable = Multiplicand * n;
            System.out.println(Multiplicand + " * " + n +  " = " + ProductTable);
            ProductTable++;
        }

        return ProductTable;
    }
}


