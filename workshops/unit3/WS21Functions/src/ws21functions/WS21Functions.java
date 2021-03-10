package ws21functions;

import java.util.Scanner;

/**
 *
 * @author AlexanderDuque
 */
public class WS21Functions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Author: Alexander Duque");
        System.out.println("\t Printers");
        float inkBlack;
        float pagesToPrintWB = 0;
        float copies;
        float timePerCopy;
        float timeToCopy = 0.0F;

        System.out.println("Paperes remain in W/B that you should print with your Blank Ink");
        System.out.println("Enter the porcent of your black ink %");
        System.out.println("\t The averegue endurance is 7 500 pages in W/B ");
        inkBlack = input.nextInt();

        pagesToPrintWB = computePaperttoprint(inkBlack);

        System.out.println("With your Ink percent ramain" + " (" + inkBlack + "%)" + " you should print " + pagesToPrintWB + " pages");

        System.out.println("Copies per hour");
        System.out.println("Enter the copies number that you want");
        copies = input.nextInt();
        System.out.println("Enter the time (in secondds)that your print copy one page");
        timePerCopy = input.nextInt();

        timeToCopy = computeTimeToCopy(copies, timePerCopy);

        System.out.println("The copies number " + copies + " will print in " + timeToCopy  + " seconds");

    }

    public static float computePaperttoprint(float inkBlack) {
        float paperstoprint;
        paperstoprint = (inkBlack * 7500) / 100;
        return paperstoprint;
    }

    public static float computeTimeToCopy(float copies, float timePerCopy) {
        float timeToCopy;
        timeToCopy = (float) (copies * timePerCopy);
        return timeToCopy;
    }
}
