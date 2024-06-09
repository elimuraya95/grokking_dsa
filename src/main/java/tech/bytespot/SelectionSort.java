package tech.bytespot;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> unsortedList) {
        // Find the smallest element
        // Add the element to a different list
        // Remove the element from the initial list
        // Iterate over the new list, without the smallest element

        ArrayList<Integer> sortedList = new ArrayList<>();
        var copiedList = unsortedList;

        while (copiedList.size() != 0) {
            var smallest = smallestElement(copiedList);
            sortedList.add(unsortedList.get(smallest));
            copiedList.remove(smallest);
        }
        return sortedList;
    }

    public static int smallestElement(ArrayList<Integer> unsortedList) {
        if (unsortedList.size()==1) return 0;
        int index = 0;
        int smallestIndex = 0;


        var smallest = unsortedList.get(index);
        for (int e : unsortedList) {
            if (smallest >= e) {
                smallest = e;
                smallestIndex = index;
            }
            index++;
        }
        return smallestIndex;

    }
}
