package iterations;
/**
 *
 * @author aduqu
 */
public class Iterations {
    public static void main(String[] args) {
    
        int ListNumber;
        ListNumber = 1;
     
    System.out.println("=== This is a while loop until find my list number === ");
    
     while ( ListNumber <= 17){
     System.out.println("List Number -> " + ListNumber );
         ListNumber++;
          }
          
     System.out.println("=== Multiplication Tables: 17 ===");
    int top = 17;
    int product = 0;
    int table = 17;
    for (int MyListNumber = 1; MyListNumber <= top; MyListNumber++){
        product = table * MyListNumber;
        System.out.println("17 * " + MyListNumber + " = " + product);
    }
    
    int number = 5;
    
    System.out.println("=== This is a while loop to find the 20 first "
            + "multiplies of 5 === ");

while (number <= 100){
    System.out.println("Multipician of 5 is Number -> " + number );
    number+=5;    
}
      
}
