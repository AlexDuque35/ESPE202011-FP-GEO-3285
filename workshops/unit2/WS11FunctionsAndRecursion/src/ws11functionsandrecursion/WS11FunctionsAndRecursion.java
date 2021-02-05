package ws11functionsandrecursion;

import java.util.Scanner;

/**
 *
 * @author aduqu
 */
public class WS11FunctionsAndRecursion {

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

        ImageP = ComputeASquare(InitialValueP);
        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       User                             *\n"
                + " *        The square of " + InitialValueP + "                                 *\n"
                + " *        is equal to ---> " + ImageP + "                             *\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");

        ImageG = ComputeAParabol(InitialValueG);
        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       User                             *\n"
                + " *The square of " + InitialValueG + " adding its double product and increase 1*\n"
                + " *        is equal to ---> " + ImageG + "                              *\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");

        ProductTable = ShowTheMultiplicationTable(Multiplicand);
        System.out.println(" ========================================================== \n"
                + " *                                                        * \n"
                + " *                       User                             *\n"
                + " *           The multiplicacion of " + Multiplicand + " until 12 " + "            *\n"
                + " *            is equal to ---> " + ProductTable + "                          *\n"
                + " *                                                        * \n"
                + " ========================================================== \n ");
    
        

    public static float divideTwoNumbers(int Dividend, int Divisor) {

        float quotient = 0.0F;

        quotient = (float) Dividend / (float) Divisor;

        return quotient;
    }

    public static int ComputeASquare(int InitialValueP) {
        int Image = 0;

        Image = InitialValueP * InitialValueP;

        return Image;

    }

    public static int ComputeAParabol(int InitialValueG) {
        int ImageG = 0;

        ImageG = InitialValueG * InitialValueG + 2 * InitialValueG + 1;

        return ImageG;

    }

    public static int ShowTheMultiplicationTable(int Multiplicand) {
        int ProductTable = 0;

        for (int n = 1; n <= 12; n++) {

            ProductTable = Multiplicand * n;
            System.out.println(Multiplicand + " * " + n + " = " + ProductTable);
            ProductTable++;
        }

        return ProductTable;
    }

    Scanner e = new Scanner(System.in);

    System.out.println (
    " Enter the First Value ");
        int scanner1 = e.nextInt();

    System.out.println (
    "Enter the Second Value");
        int scanner2 = e.nextInt();

    if (scanner1

    
        % 2 == 0) {
            System.out.println("The number " + scanner1 + " Is Divisible for 2. \n");
        System.out.println("The number " + scanner2 + " Is Divisible for 2. \n");
        int multiplicand = scanner1;
        int multiplier = scanner2;
        int product;

        MultiplyTwoNumbers(multiplicand, multiplier);
    }

    if (scanner1

    
        % 3 == 0) {
            System.out.println("The number " + scanner1 + " Is Divisible for 3. \n");
        System.out.println("The number " + scanner2 + " Is Divisible for 3. \n");
        int addend1 = scanner1;
        int addend2 = scanner2;
        int sum;

        Adding(addend1, addend2);
    }

    if (scanner1

    
        % 7 == 0) {
            System.out.println("The number " + scanner1 + " Is Divisible for 7. \n");
        System.out.println("The number " + scanner2 + " Is Divisible for 7. \n");
        int dividend = scanner1;
        int divisor = scanner2;
        int remainder;

        DivideTwoNumbersRemainder(dividend, divisor);
    }

    if (scanner1

    
        % 11 == 0) {
            System.out.println("The number " + scanner1 + " Is Divisible for 11. \n");
        System.out.println("The number " + scanner2 + " Is Divisible for 11. \n");
        System.out.println("====== MULTIPLICATION : 11 ======");

        int top = 12;
        int product = 0;
        int table = 11;

        PrintMultiplicandTable(top, table);
    }

    if (scanner1

    
        % 13 == 0) {
            System.out.println("The number " + scanner1 + " Is Divisible for 13. \n");
        System.out.println("The number " + scanner2 + " Is Divisible for 13. \n");
        int dividend = scanner1;
        int divisor = scanner2;
        int quotient;

        DivideTwoNumber(dividend, divisor);

    }

    private void PrintMultiplicandTable(int top, int table) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void MultiplyTwoNumbers(int multiplicand, int multiplier) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void Adding(int addend1, int addend2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void DivideTwoNumbersRemainder(int dividend, int divisor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void DivideTwoNumber(int dividend, int divisor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void DivideTwoNumber(int dividend, int divisor) {
        int quotient;
        quotient = dividend / divisor;
        System.out.println("So " + dividend + "/" + divisor + "=" + quotient);
    }

    public static void PrintMultiplicandTable(int top, int table) {
        int product;
        for (int j = 1; j <= top; j++) {
            product = table * j;
            System.out.println("11 * " + j + " = " + product);
        }
    }

    public static void divideTwoNumbersReminder(int dividend, int divisor) {
        int remainder;
        remainder = dividend % divisor;
        System.out.println("So " + dividend + "%" + divisor + "=" + remainder);
    }

    public static void AddingTwoNumbers(int addend1, int addend2) {
        int sum;
        sum = addend1 + addend2;
        System.out.println("So " + addend1 + "+" + addend2 + "=" + sum);
    }

    public static void Product(int multiplicand, int multiplier) {
        int product;
        product = multiplicand * multiplier;
        System.out.println("So " + multiplicand + "*" + multiplier + "=" + product);
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));
            }
        }
    }

}
