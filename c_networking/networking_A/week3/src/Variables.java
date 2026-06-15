public class Variables {
    public static void main(String[] args) {
        //Casting
        //Automatic casting
        int a = 20;
        double b = (double) a;
        System.out.println(b);
        //Manual casting
        double c = 34.5;
        int d = (int) c;
        System.out.println(d);


        //Type of naming a variable in java
        /*
        1. Camel case (myName, whatIsYourAge)
        2. Pascal case (MyName, WhatIsYourAge)
        3. Snake case (my_name, what_is_your_age)
        4. Upper case (MY_NAME, WHAT_IS_YOUR_NAME)
        */


        //Try 1
        int num1 = 10;
        int num2 = 30;

        int num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println("Num1(10) "+num1);
        System.out.println("Num2(30) "+num2);


        //output
        //print, println, printf
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.println();
        System.out.println("Hello");
        System.out.println("Hello");

        //java printf
        //%d integer
        int age = 20;
        System.out.printf("I am %d years old.\n",age);
        //%s String
        String name = "John Doe";
        System.out.printf("My name is %s\n", name);
        //%f float
        double amount = 34.76;
        System.out.printf("I have an amount of %.2f", amount);


        //Escape sequences in output
        //\n => newline
        //\t => tab
        //\"
        //\\









    }
}
