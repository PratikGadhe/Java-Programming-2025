import java.util.*;
class Person{
    String name;
    int age;
}
class Student extends Person{
    int roll;
    int total_marks;
    String course;
    void insert_detail(Scanner sc){
        System.out.print("Enter name : ");
        this.name=sc.next();
        System.out.print("Enter age : ");
        this.age=sc.nextInt();
        System.out.print("Enter roll number : ");
        this.roll=sc.nextInt();
        System.out.print("Enter Total Marks : ");
        this.total_marks=sc.nextInt();
        System.out.print("Enter Course : ");
        this.course=sc.next();
    }
    void display(){
        System.out.println("Name : "+this.name+", Age : "+this.age+", Roll : "+this.roll+", Total Marks : "+this.total_marks+", Course : "+this.course);
    }
}
public class Program15 {
    public static void main(String Args[]){
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        s1.insert_detail(sc);
        s1.display();
    }
}
