import java.util.Scanner;

public class Auth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sys_name = "admin";
        int sys_pin = 1234;

        String name;
        int pin;

        System.out.println("Enter your username");
        name = input.nextLine();
        System.out.println("Enter your pin");
        pin = input.nextInt();

        System.out.println(sys_name.equals(name));
        System.out.println(sys_pin == pin);

        if (sys_name.equals(name) && sys_pin == pin){
            System.out.println("Login Successful");
        }else {
            System.out.println("Wrong username or pin");
        }
    }
}
