package basics;

public class missingNumberInArray {
    static void main() {
        int[] number= {1, 2, 4, 6, 3, 7, 8};;
        int n=8;
        System.out.println(missingNumber(number,n));
    }

    static int missingNumber(int[] arr, int n){
        int expectedResult= n*(n+1)/2;
        int actualResult=0;
        for (int num:arr){
            actualResult+=num;
        }
        return expectedResult-actualResult;
    }
}
