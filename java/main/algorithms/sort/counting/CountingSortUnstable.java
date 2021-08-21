package java.main.algorithms.sort.counting;

import java.util.Scanner;

public class CountingSortUnstable {
    public static int[] countingSort(int[] numbers) {
        int maxVal = 10; // we suppose the maximum is 10
        int k = maxVal + 1; // the length of the array containing counts
        int[] counts = new int[k]; // it stores 11 zeros with indexes from 0 to k-1

        /* in this loop we count distinct numbers in the input array */
        for (int i = 0; i < numbers.length; i++) {
            counts[numbers[i]]++;
        }

        int pos = 0; // a position in the numbers array

        /* in this loop we modify the input array to make it sorted */
        for (int num = 0; num < k; num++) { // get the next element
            int count = counts[num]; // get the count of the element
            while (count > 0) {
                numbers[pos] = num; // write it in the numbers array
                pos++;
                count--;
            }
        }

        return numbers;
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

        countingSort(array);

        System.out.print("Sorted array in ascending order: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
