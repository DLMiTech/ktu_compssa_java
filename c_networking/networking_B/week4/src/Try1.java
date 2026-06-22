import java.util.Scanner;

public class Try1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String f_name, l_name;

        System.out.println("Enter first name: ");
        f_name = input.nextLine();
        System.out.println("Enter last name: ");
        l_name = input.nextLine();

        System.out.println(f_name.charAt(0)+"."+ l_name.charAt(0));
    }
}
