package ec.edu.espe.carModels.controller;

import java.util.Collections;

/**
 *
 * @author AlexanderDuque
 */
public class Sorting {

    public static String[] sortModels(String[] carModels) {
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (carModels[i].compareTo(carModels[j]) > 0) {
                    String temp = carModels[i];
                    carModels[i] = carModels[j];
                    carModels[j] = temp;
                }
            }
        }
        System.out.print("Strings in Sorted Order:");
        for (int i = 0; i <= 6 - 1; i++) {
            System.out.print(carModels[i] + ", ");

        }
        return carModels;
    }
}
