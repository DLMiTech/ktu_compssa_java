import java.util.Scanner;

public class Examp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sys_email = "admin@gmail.com";
        int sys_pass = 1234;

        System.out.println("Enter your email");
        String email = input.nextLine();
        System.out.println("Enter your password");
        int pass = input.nextInt();

        if (email.equals(sys_email) && pass == sys_pass) {
            System.out.println("Login Successful");
        }else {
            System.out.println("Login Failed");
        }
    }
}
