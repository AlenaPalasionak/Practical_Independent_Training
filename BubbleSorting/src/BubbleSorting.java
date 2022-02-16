import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int [] array = new int[] {1, 5, 3, 7, 9, 0, 5, 4, 6, 25, 5, 6, -1};

        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i< array.length-1;i++){
                if(array[i]> array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = false;
                }
            }
        }
printArray(array);
    }
    public static void printArray(int [] ar){
for(int i = 0; i<ar.length;i++){
    System.out.println(ar[i]);
}
    }
}
