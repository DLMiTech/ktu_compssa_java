public class Variables {
    public static void main(String[] args) {

        //Type
        //1. Primitive data type
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        //2. Non-Primitive data type
        //String

        //Declaring a variable eg: int age;
        //Assignment of values eg age = 23;
        //Initialization eg String name = "John";

        //Casting
        //Automatic casting
        int a = 20;
        double b = a;
        System.out.println(b);

        //Manual casting
        double c = 20.0;
        int d = (int) c;
        System.out.println(d);

        //Type of naming a variables in Java
        //1. Camel case (myName, whatIsYourName)
        //2. Pascal case (MyName, WhatIsYourName)
        //3. Snake case (my_name, what_is_your_name)
        //4. Upper case (MY_NAME, WHAT_IS_YOUR_NAME)


        //Jave Output
        //print, println, printf
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.println("Hello");
        System.out.println("Hello");


        //try work
        int n1 = 10;
        int n2 = 30;
        int n3;
        n3 = n1;
        n1 = n2;
        n2 = n3;

        System.out.println(n1);
        System.out.println(n2);

        //printf
        //Integer %d
        int age = 20;
        System.out.printf("I %d am %d years %d old %d.\n", age, age, age, age);
        //String %s
        String name = "John Doe";
        System.out.printf("My name is %s\n", name);
        //Float or Double %f
        double amount = 23.45;
        System.out.printf("I have an amount of %f GHc\n", amount);


        //Escape sequences
        //\n => new line
        //\t => tab
        //\" or \',.
    }

}
