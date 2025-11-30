//Write a Java program to demonstrate method overloading
// by creating multiple sum () methods
//that differ in the number of parameters.
//The program should calculate the sum of two numbers and
//the sum of three numbers using overloaded methods.
public class Sum {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String Args[]){
        Sum s1 = new Sum();
        int result1 = s1.sum(10,20);
        int result2 = s1.sum(10,10,20);
        System.out.println("Sum : "+result1);
        System.out.println("Sum : "+result2);
    }
}
