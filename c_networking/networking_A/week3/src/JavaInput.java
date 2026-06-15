import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        //Scanner class for taking input
        //Create a scanner object
        Scanner input = new Scanner(System.in);


        int age;
        String name;
        double salary;

        System.out.println("Enter your age: ");
        age = input.nextInt();
        System.out.println("Enter your name: ");
        input.next();
        name = input.nextLine();
        System.out.println("Enter your salary: ");
        salary = input.nextDouble();

        System.out.printf("My name is %s and I am %d years old. With a salary of %.2f", name, age, salary);

    }
}
