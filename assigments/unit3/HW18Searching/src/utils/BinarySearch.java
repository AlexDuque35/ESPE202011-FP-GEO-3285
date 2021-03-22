package utils;

/**
 *
 * @author AlexanderDuque
 */
public class BinarySearch {

    public static int binarySearch(int birthYear[], int left, int right, int elementToSearch) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (birthYear[mid] == elementToSearch) {
                return mid;
            } else if (birthYear[mid] > elementToSearch) {
                return binarySearch(birthYear, left, mid - 1, elementToSearch);
            }
            return binarySearch(birthYear, mid + 1, right, elementToSearch);
        }
        return -1;
    }
}
