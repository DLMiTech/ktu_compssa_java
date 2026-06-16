public class JavaOutPut {
    public static void main(String[] args) {
        //java output
        //print, println, printf
        //print
        System.out.print("Hello World");
        System.out.print("Hello World");
        System.out.print("Hello World");

        //println
        System.out.println();
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        //printf
        int age = 10;
        String name = "John Doe";
        double salary = 10.55;

        System.out.println(age);
        System.out.println(name);
        System.out.println(salary);
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
        System.out.println("Salary "+salary);
        System.out.println("My name is "+name+" and I am "+age+" years old."+"I take home "+salary+"Ghc");

        //using printf
        //int => %d
        //String => %s
        //float or double => %f
        System.out.printf("My name is %s and I am %d years old.I take home %.2f Ghc", name, age, salary);

    }
}
