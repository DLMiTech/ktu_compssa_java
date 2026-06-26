import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        //We use the Scanner class to take input from the user
        //By creating a scanner object
         Scanner input = new Scanner(System.in);

        System.out.println("Enter your age ");
        int age = input.nextInt();
        System.out.println(age);

        System.out.println("Enter an amount ");
        double amount = input.nextDouble();
        System.out.println(amount);

        System.out.println("Enter your name ");
        input.nextLine();
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Enter your name1 ");
        String name1 = input.nextLine();
        System.out.println(name1);


    }
}
