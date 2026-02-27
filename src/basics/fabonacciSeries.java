package basics;

public class fabonacciSeries {
    static void main() {
        fabonacciChecker(10);
    }


    static void fabonacciChecker(int a){
        int n=0;
        int b=1;
        System.out.println(a + " " +b + " ");

        for (int i=2; i<a;i++){
            int c=n+b;
            System.out.println(c+" ");
            n=b;
            b=c;
        }
    }
}
