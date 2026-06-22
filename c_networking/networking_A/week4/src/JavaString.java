public class JavaString {
    public static void main(String[] args) {
        //Strings
        //Strings are immutable => cannot be changed after creation

        //Common String method
        String name = "John Doe";
        //length()
        System.out.println(name);
        System.out.println(name.length());
        //charAt(int index)
        System.out.println(name.charAt(0));
        //toUpperCase
        System.out.println(name.toUpperCase());
        //toLowerCase
        System.out.println(name.toLowerCase());
        //subString
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,5));
        //equal
        System.out.println(name.equals("john doe"));
        //equalsIgnore
        System.out.println(name.equalsIgnoreCase("john doe"));
        //concat
        System.out.println(name.concat(" Bob"));
    }
}
