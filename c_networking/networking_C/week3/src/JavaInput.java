import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        //Java input
        //Take input using the Scanner class
        //Create an object of the Scanner class
        Scanner input = new Scanner(System.in);

        int age;
        String name;
        double amount;

        System.out.println("Enter your age");
        age = input.nextInt();
        System.out.println("Enter your name");
        input.next();
        name = input.nextLine();
        System.out.println("Enter your amount");
        amount = input.nextDouble();

        System.out.printf("My name is %s, I am %d years old. With an amount of GHc%.2f", name, age, amount);

    }
}
