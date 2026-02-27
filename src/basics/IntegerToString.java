package basics;

public class IntegerToString {
    static void main() {
        int input= 123;
        String  num = Integer.toString(input);
        try {
            System.out.println("It's an Integer: " + num);
        } catch (NumberFormatException e) {
            System.out.println("It's a String: " + input);
        }
    }
}
