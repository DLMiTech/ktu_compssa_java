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


    }
}
