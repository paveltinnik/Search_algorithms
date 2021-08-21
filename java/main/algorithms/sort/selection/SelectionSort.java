package java.main.algorithms.sort.selection;

import java.util.InputMismatchException;
import java.util.Scanner;

class SelectionSort {

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i; // the index of the found min

            /* Iterating over the unsorted subarray to find the min */
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }

            /* Exchanging the found min and the current element */
            int min = array[index];
            array[index] = array[i];
            array[i] = min;
        }

        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int sizeOfArray = scanner.nextInt();
            int[] array = new int[sizeOfArray];

            for (int i = 0; i < sizeOfArray; i++) {
                array[i] = scanner.nextInt();
            }

            selectionSort(array);

            for (int num : array) {
                System.out.print(num + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }

    }
}
