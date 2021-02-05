package ws09functions;

/**
 *
 * @author aduqu
 */
public class WS09FUNCTIONS {

    public static void main(String[] args) {
        int divd = 5;
        int divr = 10;
        float quotient = 0;
        int x = 9;
        int y = 0;

        quotient = divideTwoNumbers(divd, divr);

        System.out.println("Quotient of 5 and 10 is -> " + quotient);

        y = f(x);
        System.out.println("3^2 -> " + y);

        y = f(x);
        System.out.println("-3^2 -> " + y);

        x = -1;
        y = f(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);

    }

    public static float divideTwoNumbers(int dividend, int divisor) {

        float quotient = 0.0F;

        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }

}
