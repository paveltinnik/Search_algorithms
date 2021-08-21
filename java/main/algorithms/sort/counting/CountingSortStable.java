package java.main.algorithms.sort.counting;

import java.util.Scanner;

public class CountingSortStable {
    public static int[] stableCountingSort(int[] numbers, int max) {
        int k = max + 1; // the length of the array containing counts
        int[] counts = new int[k]; // it stores counts with indexes from 0 to k-1

        for (int i = 0; i < numbers.length; i++) {
            counts[numbers[i]]++;
        }

        for (int i = 1; i < counts.length; i++) {
            counts[i] = counts[i - 1] + counts[i]; // cumulative counts
        }

        int[] sortedNumbers = new int[numbers.length];

        for (int i = numbers.length - 1; i >= 0; i--) {  // go through input array in backward
            int rightmostIndex = counts[numbers[i]] - 1; // get the rightmost index
            sortedNumbers[rightmostIndex] = numbers[i];
            counts[numbers[i]]--; // decrease the index to calculate the previous occurrence
        }

        return sortedNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.print("Enter max element of array: ");
        int max = scanner.nextInt();

        System.out.print("Enter array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        array = stableCountingSort(array, max);

        System.out.print("Sorted array in ascending order: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
