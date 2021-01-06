package basicoperations;
/**
 *
 * @author aduqu
 */
public class BasicOperations {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int addend1;
        int addend2;
        int minuend;
        int subtrahend;
        int difference;
        int product;
        int multiplicant;
        int multiplier;
        int dividend;
        int divisor;
        int quotient;
        int remainder;
                                               
        addend1 = 5;
        addend2 = 18;
        minuend = -23;
        subtrahend = -6;
        multiplicant = 13;
        multiplier = 6;
        dividend = 15;
        divisor = 5;
        
    
    sum = addend1 + addend2;
    
    System.out.println("the addition of " + addend1 + " + " + addend2 + 
    " is equal to --> " + sum);
     
    ++sum;
     
    System.out.println("sum is equal to --> " + sum);
     
     sum++;
     
    System.out.println("sum is equal to --> " + sum);
    System.out.println("adding one to sum " + (sum++));
    System.out.println("adding one to sum " + (++sum));
    
    System.out.println("the substraction of " + minuend + " - " + subtrahend 
            + " is equal to " + (minuend - subtrahend));
    
    difference = minuend - subtrahend;
    
    System.out.println("difference is equal to --> " + difference);
    
    product = multiplicant*multiplier;
    product = multiplier*multiplicant;
    
    System.out.println("the multiplication of " + multiplicant + " * " + multiplier + 
                    " is equal to --> " + product);
    System.out.println("product is equal to --> " + product);
           
    quotient = dividend / divisor;
    
    System.out.println("the division of " + dividend + " / " + divisor + 
                    " is equal to --> " + quotient);
    System.out.println("quotient is equal to --> " + quotient);
    
    remainder = dividend % divisor;
    
    System.out.println("the division remaineder of " + dividend + " / " + divisor + 
                    " is equal to --> " + remainder);
    System.out.println("remainder is equal to --> " + remainder);
     
     } 
}
