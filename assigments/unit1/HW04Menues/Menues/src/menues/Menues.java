package menues;
import java.util.Scanner;
public class Menues {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        do {
        
            System.out.println(" ========= Mega Pro Calculator v2. =======");
            System.out.println("1. -> Sine");
            System.out.println("2. -> Cosine");
            System.out.println("3. -> Tangent");
            System.out.println("4. -> Power");
            System.out.println("5. -> Exit");
            
             System.out.println("Enter your menu option --> ");
            option = input.nextInt();
            
            switch (option) {

                case 1:
                    double angle;
                    double sin;
                   System.out.println("Sine");
                    System.out.println("Enter an angle -> ");
                    angle = input.nextDouble();
                    sin = (double) Math.sin(angle);
                    System.out.println(" The sin of " + angle + " is equal to"
                            + " --> " + sin );
                    break;
                case 2:
                    double angle2;
                    double cos;
                    System.out.println("Cosine");                   
                    System.out.println("Eneter an angle -> ");
                    angle2 = input.nextDouble();
                    cos = (double) Math.cos(angle2);
                    System.out.println(" The cos of " + angle2 +
                            " is equal to --> " + cos);
                    
                    break;
                case 3:
                    System.out.println("Tangent");
                    double angle3;
                    double tan;
                    
                    System.out.println("enter an angle -> ");
                    angle3 = input.nextDouble();
                    
                    tan = (double) Math.tan(angle3);
                    System.out.println(" The tan of " + angle3 +
                            " is equal to --> " + tan);
                    break;
                case 4:
                    System.out.println("Power");
                    double number;
                    double exponent;
                    double power;
                    System.out.println("Enter a number -> ");
                    number = input.nextDouble();
                    System.out.println("Enter the exponent -> ");
                    exponent = input.nextDouble();
                    power = (double) Math.pow(number, exponent);
                    System.out.println("The power of " + number + " to " + 
                            exponent + " is equal to " + power );
                    break;
                    
                    case 5:
                    System.out.println("Thanks for using my menu, good day c:");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }
        } while (option != 5);        
        }        
}
