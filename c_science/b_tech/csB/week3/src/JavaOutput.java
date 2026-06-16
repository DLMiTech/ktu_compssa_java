public class JavaOutput {
    public static void main(String[] args) {
        //Java Output
        //print, println, printf

        int age = 10;
        String name = "John";
        double salary = 10.55;

        System.out.println(age);
        System.out.println(name);
        System.out.println(salary);

        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);

        System.out.println("My name is "+name+" and I am "+ age+" years old. I take GHc"+salary+" as salary");

        //int, short, byte, long => %d
        //string => %s
        //float or double => %f
        System.out.printf("My name is %s and I am %d years old. I take GHc %.2f as salary",name, age, salary);
    }
}
