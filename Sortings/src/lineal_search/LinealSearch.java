package lineal_search;

import java.util.List;

public class LinealSearch {

    public static int search(List<Integer> list, int numToSearch) {
        for(int i = 0; i<list.size();i++){
            if(list.get(i) == numToSearch){
                return i;
            }
        }
        return -1;
    }

}
