import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Enter [%d][%d] : ",i,j);
                matrix[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(matrix[i][j]);
            }System.out.println("\n");
        }
    }
}
