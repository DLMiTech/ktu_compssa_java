public class JavaString {
    public static void main(String[] args) {
        String name = "John Doe";
        System.out.println(name);
        //length
        System.out.println(name.length());
        //charAt(int index)
        System.out.println(name.charAt(0));
        //toUpperCase
        System.out.println(name.toUpperCase());
        //toLowerCase
        System.out.println(name.toLowerCase());
        //equals
        System.out.println(name.equals("John doe"));
        System.out.println(name.equalsIgnoreCase("john doe"));


    }
}
