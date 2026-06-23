public class Operators {
    public static void main(String[] args) {
        int num1 = 27;
        int num2 = 7;
        //1. Arithmetic
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

        //2. Assignment
        //=, +=, -=, *=, /=, %=
        num1 %= 10;
        System.out.println(num1);

        //3. Comparison
        //==, !=, >, <, >=, <=
        System.out.println(num1 != num2);

        //4. Logical
        //AND => &&, OR => ||, NOT => !
    }
}
