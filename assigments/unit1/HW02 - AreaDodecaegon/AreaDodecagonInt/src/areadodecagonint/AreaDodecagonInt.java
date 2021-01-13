package areadodecagonint;
/**
 *
 * @author aduqu
 */
public class AreaDodecagonInt {
       public static void main(String[] args) {
       
       int Area;
       int Apothem;
       int Side;
       
       Side = 690;
       
    Apothem = (int) (Side/(2*0.27));
    Area = (6 * Apothem * Side);
    
    System.out.println("The area of the dodecaegon of " + Side + "u side " + 
    " is equal to --> " + Area + " u^2 ");               
    }
  }
