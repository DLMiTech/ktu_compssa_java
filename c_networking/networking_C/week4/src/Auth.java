import java.util.Scanner;

public class Auth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "admin";
        int b = 1234;

        String A;
        int B;
        System.out.println("Enter username: ");
        A = input.nextLine();
        System.out.println("Enter password: ");
        B = input.nextInt();


        System.out.println(A.equals(a));
        System.out.println(B == b);

        if (A.equals(a) && B == b){
            System.out.println("You are logged in");
        }else {
            System.out.println("Wrong username or password");
        }
    }
}
