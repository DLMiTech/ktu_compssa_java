import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        String fName, lName;
        System.out.println("Enter first name");
        fName = input.nextLine();
        System.out.println("Enter last name");
        lName = input.nextLine();
        System.out.println(fName.charAt(0)+"."+lName.charAt(0));*/


        int num1 = 27;
        int num2 = 7;
        //Arithmetic
        //+, -, *, /, %, ++, --
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println((double) num1 / (double) num2);
        System.out.println(num1 % num2);
        num1++;
        System.out.println(num1);
        num2--;
        System.out.println(num2);


        //Assignment
        //=, +=, -=, *=, /=, %=
        num1 %= 10;
        System.out.println(num1);



        //Comparison
        // ==, !=, >, <, >=, <=
        System.out.println(num1!=num2);

        //Logical
        //AND => &&
        //OR  => ||
        //NOT => !



    }
}
