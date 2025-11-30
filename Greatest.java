//W. A. J. P. To find out greatest of three numbers using nested if else statements.
// Take input from user.
import java.util.*;
public class Greatest{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.printf("Enter number 2 : ");
        int n2 = sc.nextInt();
        System.out.printf("Enter number 3 : ");
        int n3 = sc.nextInt();
        if(n1>n2){
            if(n1>n3){
                System.out.println("Greatest : "+n1);
            }
            else{
                System.out.println("Greatest : "+n3);
            }
        }
        else{
            if(n2>n3){
                System.out.println("Greatest : "+n2);
            }
            else{
                System.out.println("Greatest : "+n3);
            }
        }
    }
}