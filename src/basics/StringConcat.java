package basics;

public class StringConcat {

    static void main() {
        String s1= "Selenium";
        String s2= s1.concat(" WebDriver");
        String s3= s1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s3);
    }
}
