import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        //Java Input
        //We take input using the Scanner class
        //We need to create an object from the class
        //How to create an object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();


        System.out.println("Enter your age: ");
        int age = input.nextInt();


        System.out.println("Enter an amount");
        double amount = input.nextDouble();

        System.out.println("Name "+name);
        System.out.println("Age "+age);
        System.out.println("Amount "+amount);

    }
}
