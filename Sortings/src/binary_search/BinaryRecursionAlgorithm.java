package binary_search;

public class BinaryRecursionAlgorithm {

//   With recursion
//    public static int search(int valueToFind, int[] sortedArr, int low, int high) {
//        if(high>=low){//будем делать если самое большое число больше либо равно самому минимальному
//            int mid = low + (high-low) / 2;//определяем середину
//
//            if(sortedArr[mid]==valueToFind) {//если серединное число является тем что надо найти
//                return mid;//возвращаем его
//            }
//            if(sortedArr[mid]> valueToFind){// серединное число больше чем наше
//               return search(valueToFind, sortedArr, low ,mid-1 );//возвращаемметод с другим высшим значением
//            }//
//            else return search(valueToFind, sortedArr, mid+1, high);// серединное число меньше чем наше, меняем начало
//        }
//        return -1;// базовый случай
//    }
//}
public static int search(int valueToFind, int[] sortedArr, int low, int high) {
    while (high >= low) {
        int mid = low + (high - low) / 2;
        if (sortedArr[mid] == valueToFind) {
            return mid;
        }
        if (sortedArr[mid] > valueToFind) {
            high = mid - 1;
        } else if (sortedArr[mid] < valueToFind) {
            low = mid + 1;
        }
    }
    return -1;
}
}


