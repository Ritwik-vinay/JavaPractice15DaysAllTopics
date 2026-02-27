package basics;

public class StringToInteger {
    static void main() {
        String input= "1234";
        try {
            int num = Integer.parseInt(input);
            System.out.println("It's an Integer: " + num);
        } catch (NumberFormatException e) {
            System.out.println("It's a String: " + input);
        }

    }
}
