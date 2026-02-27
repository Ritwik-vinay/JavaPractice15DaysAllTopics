package basics;

import java.util.ArrayList;

public class reverseTheArray {
    static void main() {
        int[] a= {1,2,3,4,5,6,7};
        reverseArray(a);
    }

    static void reverseArray(int[] arr){
        ArrayList arrayList= new ArrayList();
        for (int i=arr.length-1;i>=0;i--){
            arrayList.add(arr[i]);
        }

        System.out.println(arrayList);
    }
}
