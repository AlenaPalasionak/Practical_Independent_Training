package binary_search;

import java.util.List;

public class BubbleSorting {
    public static void bubbleSort(int[] list) {

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;//2 7 0 5
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {

                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    isSorted = false;

                }
            }
        }

    }
}
