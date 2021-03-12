package taxdeclaration;

import ec.edu.espe.tax.BasicTax;
import java.util.Scanner;

/**
 *
 * @author AlexanderDuque
 */
public class TaxDeclaration {
    public static void main(String[] args) {
        
        float price;
        float totalPrice;
        float VATValue;
        final float ivaPercentage = 12;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Alexander Duque");
        System.out.println(" VAT --> ");
        System.out.println("Enter you value productos ");
        price = input.nextFloat();
        
        VATValue = BasicTax.computeVAT(price, ivaPercentage);
        totalPrice = price + VATValue;
        
        System.out.println("Total price --> " + totalPrice);
    }
    
}
