public class Program23 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
            int result = 10 / 0;
            String str = null;
            System.out.println(str.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic exception occurred");
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception");
        } catch (Exception e) {
            System.out.println("Error: General exception occurred");
        }
    }
}
