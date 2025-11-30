//Develop a program in java to calculate addition of two matrices.
import java.util.*;
public class Matrix1 {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int columns = sc.nextInt();
        int arr1[][]= new int[row][columns];
        int arr2[][]= new int[row][columns];
        int sum[][]= new int[row][columns];
        System.out.println("Enter Element for matrix 1 : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Enter Element ["+i+"]["+j+"] : ");
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Element for matrix 2 : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Enter Element ["+i+"]["+j+"] : ");
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("--Sum of array--");
        for(int i = 0; i<row;i++){
            for(int j=0;j<columns;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j]+" ");
            }System.out.println();
        }
    }
}
