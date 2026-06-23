public class JavaString {
    public static void main(String[] args) {
        String name = "John Doe";
        System.out.println(name);
        //length
        System.out.println(name.length());
        //charAt(int index)
        System.out.println(name.charAt(5));
        //toUpperCase
        System.out.println(name.toUpperCase());
        //toLowerCase
        System.out.println(name.toLowerCase());
        //equals
        System.out.println(name.equals("John doe"));
    }
}
