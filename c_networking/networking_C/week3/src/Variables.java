public class Variables {
    public static void main(String[] args) {

        //Primitive data type
        //byte = -128 to 127
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        //String

        //Declaring a variable eg int age;
        //Assignment of values eg age = 23;
        //Initialization of variables eg String name = "John";

        //Casting
        //Automatic casting
        int a = 5;
        double b = a;
        System.out.println(b);
        //Manual casting
        double c = 5.4;
        int d = (int) c;
        System.out.println(d);


        //Type of naming a variable
        //Camel case (myName, whatIsYourAge)
        //Pascal case (MyName, WhatIsYourAge)
        //Snake case (my_name, what_is_your_age)
        //Upper case (MY_NAME, WHAT_IS_YOUR_AGE)



        //Java output
        //print, println, printf
        System.out.print("Hello");
        System.out.print("Hello");

        System.out.println();
        System.out.println("Hello");
        System.out.println("Hello");

        //printf
        //Integer %d
        int num1 = 10;
        String num2 = "John";
        double num3 = 30.45;
        System.out.printf("Number\t\t\tone is %d \nand number two is %s \nand number three is %.2f", num1, num2, num3);

        //%c, %b, %e, %5d

        //Escape sequences
        //\n => new line
        //\t => tab
        //\" \'

        System.out.println("\n\n");
        int x = 10;
        int y = 30;
        int z = x;
        x = y;
        y = z;

        System.out.println(x);
        System.out.println(y);
    }
}
