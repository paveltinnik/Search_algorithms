package java.main.algorithms.sort.insertion;

import java.util.Scanner;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        /* iterating over elements in the unsorted part */
        for (int i = 1; i < array.length; i++) {
            int elem = array[i]; // take the next element
            int j = i - 1;

            /* find a suitable position to insert and shift elements to the right */
            while (j >= 0 && array[j] > elem) {
                array[j + 1] = array[j]; // shifting
                j--;
            }
            array[j + 1] = elem; // insert the element in the found position in the sorted part
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.print("Enter array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        insertionSort(array);
        
        System.out.print("Sorted array in ascending order: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
