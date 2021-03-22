package hw18sorting;

import java.util.Scanner;
import utils.BinarySearch;
import utils.LinearSearch;

/**
 *
 * @author AlexanderDuque
 */
public class HW18Sorting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int birthYears[] = {2020, 2000, 2005, 2007, 2010, 2019, 2002, 2015, 2001, 2017, 2006, 2004, 2016, 2003, 2008, 2018, 2009, 2011, 2014, 2012, 2013};
        int elementToSearch;
        int resultBinary;
        int resultLinear;
        int right;
        int mid = 9999;

        System.out.println("Enter the year to search since 2000");
        elementToSearch = input.nextInt();

        System.out.println("Welcome User \n Linear Search");

        resultLinear = LinearSearch.search(birthYears, elementToSearch);
        System.out.println(elementToSearch + " is found at index: " + resultLinear);

        right = birthYears.length - 1;
        resultBinary = BinarySearch.binarySearch(birthYears, mid + 1, right, elementToSearch);

        System.out.println("Binary Search");
        System.out.println("Element found at index " + resultBinary);
    }
}
