package lineal_search;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int valueToFind = Integer.parseInt(bufferedReader.readLine());


        List<Integer> sortedList= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            sortedList.add(i);
        }

        System.out.println(LinealSearch.search(sortedList, valueToFind));
    }
}

