import java.util.Scanner;

public class Try1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fName, lName;

        System.out.println("Enter first name");
        fName = input.nextLine();
        System.out.println("Enter last name");
        lName = input.nextLine();

        System.out.println(fName.charAt(0)+"."+lName.charAt(0));
    }
}
