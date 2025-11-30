//1. W.A.J.P. To find out greatest of three numbers using nested if else statements. 
// Take input from user.
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        
        if (a > b) {
            if (a > c) {
                System.out.println("Greatest: " + a);
            } else {
                System.out.println("Greatest: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Greatest: " + b);
            } else {
                System.out.println("Greatest: " + c);
            }
        }
        sc.close();
    }
}