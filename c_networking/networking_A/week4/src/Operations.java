public class Operations {
    public static void main(String[] args) {
        int num1 = 27;
        int num2 = 5;
        //Arithmetic operation
        //+, -, *, /, %, ++, --
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println((double) num1 / (double) num2);
        System.out.println((double) num1 / num2);
        num1++;
        System.out.println(num1);
        num2--;
        System.out.println(num2);


        //Assignment operation
        // =, +=, -=, /=, *=, %=
        int num3 = 12;
        int num4 = 5;
        num4 %= 3;
        System.out.println(num4);
        //Comparison operation
        //==, !=, >, <, >=, <=
        System.out.println(num3 >= num4);
        //Logical Operation
        //AND => &&, OR => ||, NOT => !

        //Ternary operator => ? :


        //++, --
        //post and per
        int age = 10;
        int newAge = ++age; // age is incremented first, then assigned to newAge
        System.out.println("Age "+age);
        System.out.println("New age "+newAge);

        //post
        int age1 = 10;
        int newAge1 = age1++; // age is assigned first, then incremented to newAge
        System.out.println("Age1 "+age1);
        System.out.println("New age1 "+newAge1);
    }
}
