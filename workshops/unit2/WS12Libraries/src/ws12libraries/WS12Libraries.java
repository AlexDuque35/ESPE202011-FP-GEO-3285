package ws12libraries;

/**
 * |
 *
 * @author aduqu
 */
public class WS12Libraries {

    public static void main(String[] args) {

        float squareRoot = 0.0F;
        float squareRoot2 = 0.0F;
        float squareRoot3 = 0.0F;
        float number = 9;
        float number2 = 49;
        float number3 = 5;
        float power = 0.0F;
        float power2 = 0.0F;
        float power3 = 0.0F;
        float base = 3;
        float base2 = 2;
        float base3 = 78;
        float exponent = 2;
        float exponent2 = 4;
        float exponent3 = 5;
        float absoluteValue = 0.0F;
        float number4 = -5;

        squareRoot = (float) Math.sqrt((float) number);
        System.out.println("The square root of --> " + number
                + " is equal to --> " + squareRoot);
        squareRoot2 = (float) Math.sqrt((float) number2);
        System.out.println("The square root of --> " + number2
                + " is equal to --> " + squareRoot2);
        squareRoot3 = (float) Math.sqrt((float) number3);
        System.out.println("The square root of --> " + number3
                + " is equal to --> " + squareRoot3);

        power = (float) Math.pow(base, exponent);
        System.out.println("The power of --> " + base + " to " + exponent
                + " is equal to --> " + power);
        power2 = (float) Math.pow(base2, exponent2);
        System.out.println("The power of --> " + base2 + " to " + exponent2
                + " is equal to --> " + power2);
        power3 = (float) Math.pow(base3, exponent3);
        System.out.println("The power of --> " + base3 + " to " + exponent3
                + " is equal to --> " + power3);

        absoluteValue = getAbsoluteValue(number4);
        System.out.println( absoluteValue);

    }

    public static float computePower(float base, float exponent) {
        float power = 1.0F;
        for (int i = 1; i <= (int) exponent; i++) {
            power = power * base;
        }
        return power;
    }

    private static float getAbsoluteValue(float number) {
        if (number < 0) {
            number = number * -1;
            return number;
        } else {
            return number;

        }
    }
}
