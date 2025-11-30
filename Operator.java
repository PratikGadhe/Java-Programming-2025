import java.util.Scanner;

public class Operator{
    public static void main(String[] args) {
        int n1,n2,add,sub,mul,div,mod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        n1=sc.nextInt();
        System.out.println("Enter Second Number : ");
        n2=sc.nextInt();
        
        add=n1+n2;
        sub=n1-n2;
        mul=n1*n2;
        div=n1/n2;
        mod=n1%n2;

        System.out.println("Addition : "+add);
        System.out.println("Subtraction : "+sub);
        System.out.println("Multipication : "+mul);
        System.out.println("Division : "+div);
        System.out.println("Modulus : "+mod);
    }
}