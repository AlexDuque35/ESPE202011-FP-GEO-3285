package hw14arrayce;

import java.util.Scanner;

/**
 *
 * @author AlexanderDuque
 */
public class HW14Arrayce {

    public static void main(String[] args) {
        System.out.println("================\n *** SAFARI *** \n================");
        int[] animalsSeen;
        String[] wildAnimals = {"Elephant", "Lion", "Giraffe", "Zebra",
            "Cheetah", "Leopard", "Hippopotamus", "Puma", "Gorilla"};
        int n;

        System.out.println("Enter the safary time in hours");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        animalsSeen = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of animmals seen in hour " + (i + 1) + " -> ");
            animalsSeen[i] = input.nextInt();
        }

        for (int animals : animalsSeen) {
            System.out.println("Animals seen are " + animals);
        }

        for (String wildAnimal : wildAnimals) {
            System.out.println("Animals seen are -> " + wildAnimal);
        }

        System.out.println("==================\n *** AQUARIUM *** \n==================");
        int[] fishesOnATank;
        String[] fishesSpecies = {"Goldfish", "Guppy", "Cat Fish", "Nemo", "Zebra Fish", "Angel Fish"};
        int num;

        System.out.println("Enter the time that you want to study fishes movement in hours");
        num = input.nextInt();

        fishesOnATank = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter the number of fishes on a Tank in hour " + (i + 1) + " -> ");
            fishesOnATank[i] = input.nextInt();
        }

        for (int fishes : fishesOnATank) {
            System.out.println("Fishes on a tank are " + fishes);
        }

        for (String fish : fishesSpecies) {
            System.out.println("Fishes species are -> " + fish);
        }

        System.out.println("=========================\n *** BIRDS SANTUARY *** \n=========================");
        int[] birdsOnSector;
        String[] birdsSpecies = {"Eagle", "Condor", "Falcon", "Pidgeon", "Owls", "Toucans"};
        int number;

        System.out.println("Enter the numbers of sectors ");
        number = input.nextInt();

        birdsOnSector = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter the number of birds that live in a sector " + (i + 1) + " -> ");
            birdsOnSector[i] = input.nextInt();
        }

        for (int birds : birdsOnSector) {
            System.out.println("Fishes on a tank are " + birds);
        }

        for (String bird : birdsSpecies) {
            System.out.println("Birds species are -> " + bird);
        }

    }

}
