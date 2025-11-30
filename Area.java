public class Area {
    int area(int length,int breadth){
        return length*breadth;
    }
    double area(double length, double breadth){
        return length*breadth;
    }
    public static void main(String Args[]){
        
        Area rec = new Area();
        System.out.println("Area of Rectangle : (int value) "+ rec.area(5,10));
        System.out.println("Area of Rectangle : (double value) "+ rec.area(5.2,10.0));
    }
}
