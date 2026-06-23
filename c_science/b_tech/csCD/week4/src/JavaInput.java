import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age ");
        int age = input.nextInt();

        System.out.println("Enter an amount ");
        double amount = input.nextDouble();
        input.nextLine();
        System.out.println("Enter your name ");
        String name = input.nextLine();

        System.out.println(age);
        System.out.println(amount);
        System.out.println(name);
    }
}
