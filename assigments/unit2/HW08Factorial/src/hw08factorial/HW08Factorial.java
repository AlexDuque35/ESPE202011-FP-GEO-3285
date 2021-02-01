package hw08factorial;
import java.util.Scanner;
/**
 *
 * @author aduqu
 */
public class HW08Factorial {
    public static void main(String[] args) {

       int number;
       int factorial = 1;
       int i = 1;
       
       do{
            System.out.println("Enter a number from 0 to 15 ");
            Scanner input = new Scanner(System.in);
            number = input.nextInt();
            
            while(i <= number){ 
                
                factorial*= i;
                i++;
            }          
       
       System.out.println("The factorial of " + number + " is equal to --> " 
               + factorial);
            
       }while (number != 16);
      
       System.out.println("Good bye");
    }
    
}
