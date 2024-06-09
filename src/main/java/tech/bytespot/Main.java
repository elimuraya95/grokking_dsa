package tech.bytespot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /** Running binary search
        List<Integer> sortedArray = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        var element = BinarySearch.binarySearch(sortedArray, 19);
        System.out.println("Found element in the list: ".concat(String.valueOf(element)));
         **/

        // Running Selection sort
        ArrayList<Integer> unsortedArray = new ArrayList<>(List.of(19, 21, 30, 4, 5, 60, 7, 8, 98, 10, 11));
        var resultArray = SelectionSort.selectionSort(unsortedArray);
        System.out.println("Unsorted array: ".concat(String.valueOf(unsortedArrayw)));
        System.out.println("Sorted array using selection sort: ".concat(String.valueOf(resultArray)));


    }
}