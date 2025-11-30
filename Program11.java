public class Program11 {
    public static void main(String[] args) {
        String str = "Hello World";
        
        System.out.println("Original: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(0, 5));
        System.out.println("Replace: " + str.replace("World", "Java"));
    }
}
