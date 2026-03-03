package basics;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamMergedArrays {
    static void main() {
        int[] array = {1,2,5,4,3};
        int[] array1 = {5,9,8,7,6};
        MergedArrays(array,array1);
    }

    static void MergedArrays(int[] a, int[] b){
        int[] merged= IntStream.concat(IntStream.of(a),IntStream.of(b)).distinct()
                .sorted().toArray();

        System.out.println(Arrays.toString(merged));
    }
}
