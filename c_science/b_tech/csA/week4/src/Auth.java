import java.util.Scanner;

public class Auth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sys_email = "admin@gmail.com";
        String sys_password = "Admin@123";
        boolean sys_user_is_admin = true;


        String email, password;
        System.out.println("Enter your email");
        email = input.nextLine();
        System.out.println("Enter your password");
        password = input.nextLine();

        if (sys_email.equalsIgnoreCase(email) && sys_password.equals(password)){
            String message = sys_user_is_admin ? "Login Successful as admin" : "Login Unsuccessful as user";
            System.out.println(message);
        }else {
            System.out.println("Wrong email or password");
        }
    }
}
