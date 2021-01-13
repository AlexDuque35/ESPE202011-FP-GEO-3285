package areadodecagonshort;
/**
 *
 * @author aduqu
 */
public class AreaDodecagonShort {

    public static void main(String[] args) {
       
    short Area;
    short Apothem;
    short Side;
    
    Side = 50;
    Apothem = (short)(Side/(2*0.27));
    Area = (short) (6 * Apothem * Side);
    
    System.out.println("The area of the dodecaegon of " + Side + "u side " + 
    " is equal to --> " + Area + " u^2 ");
    } 
}
