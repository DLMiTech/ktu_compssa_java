public class Operators {
    public static void main(String[] args) {
        //Operations
        int num1 = 27;
        int num2 = 5;
        //Arithmetic operator
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
        int num3 = 17;
        System.out.println(num3);
        num3 %= 5;
        System.out.println(num3);
        //Comparison
        //==, !=, >, <, >=, <=
        System.out.println(num1 != num2);
        //Logical
        //AND => &&, OR => ||, NOT => !
    }
}
