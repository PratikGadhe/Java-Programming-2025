//Write a Java program to find the area of the rectangle using Method Overloading 
// by changing the datatype of parameters.
public class Program4 {
    int area(int length, int width) {
        return length * width;
    }
    
    double area(double length, double width) {
        return length * width;
    }
    
    public static void main(String[] args) {
        Program4 obj = new Program4();
        System.out.println("Area (int): " + obj.area(5, 10));
        System.out.println("Area (double): " + obj.area(5.5, 10.2));
    }
}
