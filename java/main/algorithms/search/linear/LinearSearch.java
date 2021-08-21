package java.main.algorithms.search.linear;

import java.util.InputMismatchException;
import java.util.Scanner;

class LinearSearch {

    public static int searchInSortedArray(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            } else if (array[i] > value) {
                break;
            }
        }
        return index;
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

            int indexOfValue = searchInSortedArray(array, value);
            System.out.println("Index of value is " + indexOfValue);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }

    }
}
