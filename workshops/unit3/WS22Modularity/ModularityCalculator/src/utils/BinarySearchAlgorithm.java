package utils;

/**
 *
 * @author aduqu
 */
public class BinarySearchAlgorithm {

    int binarySearch(int VWModels[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (VWModels[mid] == x) {
                return mid;
            }
            if (VWModels[mid] > x) {
                return binarySearch(VWModels, mid + 1, right, x);
            }
        }
        return -1;
    }
}
