class Shape {
    void area() {
        System.out.println("Area calculation");
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    void area() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

class Triangle extends Shape {
    double base, height;
    
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    void area() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}

public class Program18 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Triangle(3, 8);
        
        s1.area();
        s2.area();
        s3.area();
    }
}
