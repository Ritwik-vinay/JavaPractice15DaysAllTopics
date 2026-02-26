package basics;

public class findLargestNumberInArray {
    static void main() {
        int[] a= {10, 5, 25, 8, 15, 3};
        largestNum(a);
    }

    static void largestNum(int[] a){
        int max= a[0];
        for (int i=0;i<=a.length-1;i++){
            if (max<a[i]){
                max= a[i];
                break;
            }
        }
        System.out.println(max);
    }
}
