package basics;

import java.util.Arrays;

public class ArrayReverse {
    static void main() {
        int[] arr=new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        reverseTheArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseTheArray(int [] arr){
        int start=0;
        int end= arr.length-1;
        while (start<end){
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}
