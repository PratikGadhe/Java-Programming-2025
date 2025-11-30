//Develop a program in java to calculate sum and average of array elements.
import java.util.*;
public class Array1{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Size of array : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        int sum = 0;
        System.out.println("--Enter Array Element--");
        for(int i = 0;i<n;i++){
            System.out.printf("Element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of array element : "+sum);
        System.out.println("Average of array element : "+(sum/n));
    }
}