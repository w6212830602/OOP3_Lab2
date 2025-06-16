package exercise3;

import java.util.Random;
import java.util.Arrays;

public class Driver {
    public static final int SIZE = 100;
    public static final int UPPER_BOUND = 1000;

    public static void bubbleSortDescending(Integer[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for each pass
        for (int i = 0; i < n -1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        // Generate a random array of integers
        Integer[] nums = new Integer[SIZE];
		Random rand = new Random();

		for( int i = 0; i < SIZE; i++ )
		{
			nums[i] = rand.nextInt( UPPER_BOUND );
		}
        
        // Print original array
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(nums));

        // Check if a command-line argument was passed
        if (args.length > 0) {
            char sortOption = args[0].toLowerCase().charAt(0);

            switch (sortOption) {
            case 'b':
                bubbleSortDescending(nums);
                break;
            case 'i':
            case 's':
            case 'q':
                break;
            default:
                break;
            }
        }

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(nums));
    }
}
