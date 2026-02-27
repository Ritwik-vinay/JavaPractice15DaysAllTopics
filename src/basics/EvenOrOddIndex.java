package basics;

public class EvenOrOddIndex {
    static void main() {
        String[] in={"Java", "Selenium", "TestNG", "Maven", "Jenkins", "Docker"};
        evenOddIndexValues(in);
    }
    static void evenOddIndexValues(String[] input){
        System.out.println("Element at Even Index: ");
        for (int i=0;i<input.length-1;i+=2){
            System.out.println(input[i]);
        }
        System.out.println("\n Element at ODD Index: ");
        for (int i=1;i<=input.length-1;i+=2){
            System.out.println(input[i]);
        }

    }
}
