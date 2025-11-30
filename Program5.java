public class Program5 {
    int sum(int a, int b) {
        return a + b;
    }
    
    int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        Program5 obj = new Program5();
        System.out.println("Sum of 2 numbers: " + obj.sum(10, 20));
        System.out.println("Sum of 3 numbers: " + obj.sum(10, 20, 30));
    }
}
