package java.main.algorithms.search.binary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] array, int elem, int left, int right) {
        if (left > right) {
            return -1; // search interval is empty, the element is not found
        }

        int mid = left + (right - left) / 2; // the index of the middle element

        if (elem == array[mid]) {
            return mid; // the element is found, return its index
        } else if (elem < array[mid]) {
            return binarySearch(array, elem, left, mid - 1); // go to the left subarray
        } else {
            return binarySearch(array, elem, mid + 1, right); // go to the right subarray
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter size of array: ");
            int sizeOfArray = scanner.nextInt();
            int[] array = new int[sizeOfArray];

            System.out.print("Enter elements of sorted array of size " + sizeOfArray + ": ");
            for (int i = 0; i < sizeOfArray; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter the number you want to find: ");
            int value = scanner.nextInt();

//            int indexOfValue = searchInSortedArray(array, value);
//            System.out.println("Index of value is " + indexOfValue);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }

    }
}
