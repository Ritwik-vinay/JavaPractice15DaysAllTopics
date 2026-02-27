package basics;

import java.util.Arrays;

public class SortedArrayChecker {
    static void main() {
        int[] array = {1, 5, 3, 7, 9};
        int[] array1 = {1, 2, 4, 7, 9};
        sortArrayCheck(array);
        sortArrayCheck(array1);
    }

    static void sortArrayCheck(int [] arr){
        boolean isSorted= true;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        System.out.println(Arrays.toString(arr) + " is Sorted " + isSorted);
    }
}
