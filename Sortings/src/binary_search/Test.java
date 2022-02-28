package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.*;

public class Test {
    public static void main(String[] args)  {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int valueToFind = 0;
        try {
            valueToFind = parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] array = {1, 3, 5, 0, 7, 9, 4, 5, 8, 2};

        BubbleSorting.bubbleSort(array);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        System.out.println(BinaryRecursionAlgorithm.search(valueToFind, array,0, 9));

    }

}

