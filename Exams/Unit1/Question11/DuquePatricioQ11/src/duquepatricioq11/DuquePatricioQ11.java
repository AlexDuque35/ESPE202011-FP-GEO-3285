package duquepatricioq11;
import java.util.Scanner;
/**
 *
 * @author aduqu
 */
public class DuquePatricioQ11 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
    boolean mainLoop = true; 
    int option;
    do{
        System.out.println("== Multiplication tables ==");
        System.out.println("1. Multiplication \n 0. Exit");
        option = input.nextInt();
        
        switch(option){
        default:
        final int top = 12;
        int product;
        int table;
        System.out.println("Enter the table that you want to study --> ");
        table = input.nextInt();
        System.out.println("Multiplication tables: " + table);
       for(int n = 1; n <= top; n++){
            product = table * n;
            System.out.println( table + " * " + n + " = " + product);
            product++;
        }
              break;
                 case 0:
            System.out.println("-> Good Bye <-");
                    System.exit(0);
                    break;

        }
    }while (option != 0);
    }
    }
        
       

