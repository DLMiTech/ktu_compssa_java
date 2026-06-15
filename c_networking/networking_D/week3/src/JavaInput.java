import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        //We can take input using the Scanner class
        //Create on object from the class
        Scanner input = new Scanner(System.in);
        int age;
        String name;
        double amount;

        System.out.println("Enter your age");
        age = input.nextInt();
        System.out.println("Enter your name");
        name = input.next();
        System.out.println("Enter your amount");
        amount = input.nextDouble();


        System.out.println("My name is "+name);
        System.out.printf("I am %d years old.\n",age);
        System.out.println(amount);
    }
}
