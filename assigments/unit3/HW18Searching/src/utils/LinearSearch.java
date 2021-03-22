package utils;

/**
 *
 * @author AlexanderDuque
 */
public class LinearSearch {

    public static int search(int yearBirth[], int elementToSearch) {
        int n = yearBirth.length;
        for (int i = 0; i < n; i++) {
            if (yearBirth[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

}
