class StringMethodsDemo {
    public static void main(String[] args) {

        String str = "Hello Java";

        // 1. length() – returns the length of the string
        System.out.println("Length of string: " + str.length());

        // 2. toUpperCase() – converts the string to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. toLowerCase() – converts the string to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. charAt() – returns character at a specific index
        System.out.println("Character at index 1: " + str.charAt(1));

        // 5. substring() – returns part of the string
        System.out.println("Substring (0 to 5): " + str.substring(0, 5));
    }
}
