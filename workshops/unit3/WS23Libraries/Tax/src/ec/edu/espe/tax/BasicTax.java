package ec.edu.espe.tax;

/**
 *
 * @author AlexanderDuque
 */
public class BasicTax {

    public static float computeVAT(float basePrice, float porcentagevalue) {
        float VAT;
        VAT = (basePrice * porcentagevalue) / 100;
        return VAT;
    }

}
