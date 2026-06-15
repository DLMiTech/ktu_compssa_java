import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        //Java uses the Scanner class to take input
        //Create an object from the Scanner class;
        Scanner input = new Scanner(System.in);

        int age;
        String name;
        double salary;

        System.out.println("Enter your age");
        age = input.nextInt();
        System.out.println("Enter your name");
        input.next();
        name = input.nextLine();
        System.out.println("Enter your salary");
        salary = input.nextDouble();

        System.out.println(name+" "+age+" "+salary);
        System.out.println("Name:\t"+name);
        System.out.println("Age:\t"+age);
        System.out.println("Salary:\t"+salary);




    }
}
