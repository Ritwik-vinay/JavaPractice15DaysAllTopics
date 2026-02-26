package basics;

public class revTheInteger {
    static void main() {
        int a=12345;
        int b=121;
        System.out.println(palindromeChecker(a));
        System.out.println(palindromeChecker(b));
    }


    static boolean palindromeChecker(int a){
        int original=a;
        int rev=0;
        boolean isPalindrome=false;

        while (a!=0){
            int digit = a%10;
            rev= rev*10+ digit;
            a = a/10;
        }
        if (original==rev){
            isPalindrome=true;
        }
        return isPalindrome;
    }
}
