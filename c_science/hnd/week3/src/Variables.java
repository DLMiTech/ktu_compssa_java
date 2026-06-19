public class Variables {
    public static void main(String[] args) {
        //java comments
        //1. Single line comments //
        //2. Multi line comments  /*    */

        //variables
        //declaring a variable
        int age;
        //assignment of values
        age = 29;
        //Initialization of variables
        String name = "John Doe";

        //data types
        // byte     => -128 to 127
        byte num1 = -128;
        // short    => -32,768 to 32,767
        short num2 = 32199;
        // int      =>  2.1B
        int num3 = 2_100_000_000;
        //long      => 9,000,000,000,000,000,000
        long num4 = 3_456_789L;
        //float     => 5-6 dp
        float num5 = 3.45F;
        //double    => 15 dp
        double num6 = 3.4599;
        //char      => 'a', 'D', '3', '@'
        char num7 = 'a';
        //boolean


        //Non-primitive data type
        //String
        //Arrays
        //Class
        //Object
        //Interface


        //Naming types of a variable
        //1. Camel case => eg: age, myAge, whatIsYourAge
        //2. Pascal case => eg: Age, MyAge, WhatIsYourAge
        //3. Snake case  =>  eg: age, my_age, what_is_your_age
        //4. Upper case  =>  eg: AGE, MY_AGE, WHAT_IS_YOUR_AGE


        //Casting
        //Automatic casting
        double b = 10;

        System.out.println(b);
        //Manual casting
        int d = (int) 10.1;
        System.out.println(d);

        System.out.println("Hello World");

    }
}
