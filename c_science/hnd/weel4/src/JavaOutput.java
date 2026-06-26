public class JavaOutput {
    public static void main(String[] args) {
        //print, println, printf
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        String name = "John Doe";
        int age = 25;

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("My name is "+name+" I am "+age+" years old");

        //printf
        //byte, short, int, long => %d
        //String => %s
        //float or double => %f
        System.out.printf("My name is %s  I am %d years old",name, age);
    }
}
