import java.util.Scanner;

public class JavaString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "John Doe";

        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(5));
        System.out.println(name.equalsIgnoreCase("joHn DoE"));

    }
}
