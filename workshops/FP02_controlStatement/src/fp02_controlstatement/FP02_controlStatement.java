
package fp02_controlstatement;

import java.util.Scanner;

  public class FP02_controlStatement {
    public static void main(String[] args) {
     
    /**
     * @param args the command line arguments
     */
      System.out.println("Enter an Integer number:");

    Scanner input= new Scanner(System.in);
    int num = input.nextInt();

    if ( num % 2 == 0 )
        System.out.println("The number entered is even");
     else
        System.out.println("The number entered is odd");
  }
}	