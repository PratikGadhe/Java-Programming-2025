public class Program22 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        try {
            System.out.println("Element at index 2: " + arr[2]);
            System.out.println("Element at index 10: " + arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds");
        }
    }
}
