package areadodecagonfloat;
/**
 *
 * @author aduqu
 */
public class AreaDodecagonFloat {
    public static void main(String[] args) {
     
    float Area;
    float Apothem;
    float Side;

    Side = (float) 24785.9847;
   Apothem = (float)(Side/(2*0.27));
    Area = (float) (6 * Apothem * Side);
    
    System.out.println("The area of the dodecaegon of " + Side + "u side " + 
    " is equal to --> " + Area + " u^2 ");
    }
   
}
