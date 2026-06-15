public class Variables {
    public static void main(String[] args) {
        //Data types
        //A. Primitive data type
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        //B. Non-Primitive data type
        //String

        //Declaring variable eg: int age;
        //Assignment of values eg: age = 23;
        //Initialization of variable eg: String name = "John";


        //Casting
        //Automatic casting
        int a = 10;
        double b = a;
        System.out.println(b);
        //Manual casting
        double c = 10.0;
        int d = (int) c;
        System.out.println(d);

        //Types of naming variables in java
        //1. Camel case (myName, whatIsYourAge)
        //2. Pascal case (MyName, WhatIsYourAge)
        //3. Snake case (my_name, what_is_your_age)
        //4. Upper case (MY_NAME, WHAT_IS_YOUR_AGE)


        System.out.println("----------------");
        int num1 = 10;
        int num2 = 30;
        int num3;
        num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println(num1);
        System.out.println(num2);


        //Java output
        //print, println, printf
        //printf
        //Integer %d
        //String %s
        //Float or double %f
        int age = 23;
        String name = "David";
        double amount = 34.98;
        System.out.printf("My name is %s \n\n\nI am %d \t\tyears old, I \"have\" %f", name, age, amount);

        //Escape sequences in output
        //\n => new line
        //\t => tab
        //\" => Double quote
    }
}
