package tech.bytespot;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    /**
     * Binary search function
     * @param sortedArray
     * @param searchElement
     * @return
     */
    public static int binarySearch(List<Integer> sortedArray, int searchElement) {
        // initial low point to use
        var low = 0;
        // initial high point to use, is the last element in the array
        var high = sortedArray.size() - 1;

        // mid point
        var mid = (high + low) / 2;
        int count = 1;

        // while we haven't come down to the last element
        while (low <= high) {
            // get the mid point of the array
             mid = (high + low) / 2;
            var guess = sortedArray.get(mid);
            System.out.println("Iteration count: ".concat(String.valueOf(count)));

            if (guess == searchElement) {
                // the mid point is the number we're looking for
                return mid;
            }
            if (searchElement < guess) {
                // the guess is too high, make the mid point the high point
                high = mid -1;
            }
            if (searchElement > guess) {
                // the guess is too low, make the mid point the low point
                low = mid + 1;
            }
        }
        return -1;
    }
}
