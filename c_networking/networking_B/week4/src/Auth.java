import java.util.Scanner;

public class Auth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sys_email = "admin@gmail.com";
        String sys_password = "Admin@123";

        String email, password;
        System.out.println("Enter your email");
        email = input.nextLine();
        System.out.println("Enter your password");
        password = input.nextLine();

        System.out.println("Email is: "+ sys_email.equals(email));
        System.out.println("Password is: "+ sys_password.equals(password));


        if (sys_email.equals(email) && sys_password.equals(password)) {
            System.out.println("Login Successful");
        }else {
            System.out.println("Wrong email or password");
        }
    }
}
