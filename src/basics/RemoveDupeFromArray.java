package basics;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupeFromArray {
    static void main() {
        int[] arr= {2,2,4,5,6,6,7,8,7};
        System.out.println(dupeArray(arr));
    }

    static Set<Integer> dupeArray(int[] arr){
        Set<Integer> set= new HashSet<>();
        for (int a: arr){
            set.add(a);
        }
        return set;
    }
}
