public class JavaString {
    public static void main(String[] args) {
        String name = "John Doe";

        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(5));
        System.out.println(name.toLowerCase());
        System.out.println(name.equals("John doe"));
        System.out.println(name.equalsIgnoreCase("johN doe"));
    }
}
