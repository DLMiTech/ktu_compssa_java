public class Variables {
    public static void main(String[] args) {
        //Java comment
        //Single-line comment   //
        //Multi-line comment    /* all comments */
        /*System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");*/

        //Variables
        //Declaring a variable eg: int age;
        int age;
        //Assignments of values eg: age = 20;
        age = 46;
        //Initialization of variable eg: String name = "John"
        String name = "John";

        //Data types
        //1. Primitive data type
        //i. byte       => -128 to 127
        //ii. short     => -32,768 to 32,767
        //iii. int      => -2,147,483,648 to 2,147,483,647
        //iv. long      => -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //v. float      => 5 to 6 dp
        //vi. double     => 15 dp
        //vii. char     => 'A', 'a', '3', '@'

        //2. Non-Primitive data type
        //String
        //Array
        //Class
        //Object
        //Interface


        //Types of naming a variable
        //1. Camel case     => (age, myAge, whatIsYourAge)
        //2. Pascal case    => (Age, MyAge, WhatIsYourAge)
        //3. Snake case     => (age, my_age, what_is_your_age)
        //4. Upper case     => (AGE, MY_AGE, WHAT_IS_YOUR_AGE)


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
