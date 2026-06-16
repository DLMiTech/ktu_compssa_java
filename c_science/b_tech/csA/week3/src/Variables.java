public class Variables {
    public static void main(String[] args) {
        //Comments
        //Single-line comments  => //
        //Multi-line comments => /* */

        //Variables
        //Declaring a variable
        int age;
        double amount;
        //Assignment of values
        age = 10;
        amount = 100.90;
        //Initialization of variables
        String name = "John Doe";


        //Data types
        //1. Primitive data type
        //a. byte   => -128 to 127
        //b. short  => -32,768 to 32,767
        //c. int    => -2,147,483,648 to 2,147,483,647
        //d. long   =>  -9,000,000,000,000,000,000
        //e. float  => 6 - 7 dp
        //f. double => 15 dp
        //g. char   => 'A', '4', '@'
        //h. boolean => true / false

        //Non-Primitive data type
        //a. String
        //b. Arrays
        //c. Classes
        //d. Objects


        //Types of name variables
        //Camel case    => (myName, whatIsYourAge)
        //Pascal case   => (MyName, WhatIsYourAge)
        //Snake case    => (my_name, what_is_your_age)
        //Upper case    => (MY_NAME, WHAT_IS_YOUR_AGE)


        //Casting
        //Automatic casting
        int a = 10;
        double b = a;
        System.out.println(b);
        //Manual casting
        double c = 10.0;
        int d = (int) c;
        System.out.println(d);


    }
}
