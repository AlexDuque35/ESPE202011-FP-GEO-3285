package q01_02212021;

import java.util.Scanner;
/**
 *
 * @author AlexanderDuque
 */
public class Q01_02212021 {
  
    public static void main(String[] args) {
         int totalOfPlayers = 0;
        String[] players;
        float[] goalAverages;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please Enter the amount of players you want to record -> ");
        totalOfPlayers = scanner.nextInt();

        players = new String[totalOfPlayers];
        goalAverages = new float[totalOfPlayers];

        for (int i = 0; i < totalOfPlayers; i++) {
            scanner.nextLine();
            System.out.print(" Please Enter the name of player # " + (i+1) + " -> ");
            players[i] = scanner.nextLine();
            System.out.print(" Please enter " + players[i] + " goals average ->");
            goalAverages[i] = scanner.nextFloat();
        }

        System.out.println(" Player    ->  \t     goal average ");

        for (int i = 0; i < totalOfPlayers; i++) {
            System.out.println(players[i] + " ->  \t " + goalAverages[i]);
        }

        
        
    }
    
}
