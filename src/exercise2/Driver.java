package exercise2;

import java.util.Random;
import java.util.Scanner;

public class Driver {
    public static final int SIZE = 100;
    public static final int UPPER_BOUND = 10;

    public static int binarySearch(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[SIZE];
        Random rand = new Random();

        // Fill nums[] with increasing sorted integers
        int randNum = rand.nextInt(UPPER_BOUND);
        nums[0] = randNum;

        for (int i = 1; i < SIZE; i++) {
            randNum = rand.nextInt(UPPER_BOUND);
            nums[i] = nums[i - 1] + randNum;
        }

        // Print the sorted array
        System.out.println("Generated sorted list:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // Prompt user for a target number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        int target = scanner.nextInt();

        // Perform binary search
        int index = binarySearch(nums, target);

        // Display the result
        if (index != -1) {
            System.out.println("Target " + target + " found at index " + index + ".");
        } else {
            System.out.println("Target " + target + " not found in the list.");
        }

        scanner.close();
    }
}
