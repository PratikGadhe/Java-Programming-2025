import java.util.Scanner;
class Student{
    int roll_no;
    String name;
    float cgpa;
    void insert_detail(int roll,String n,float c){
        roll_no=roll;
        name=n;
        cgpa=c;
    }
    void display_detail(){
        System.out.println("Name of student : "+name);
        System.out.println("Roll number : "+roll_no);
        System.out.println("Cgpa Obtained : "+cgpa);
    }
}
public class method {
    public static void main(String [ ]args){
        Scanner input = new Scanner(System.in);
        int roll_no;
        float cgpa;
        String name;
        System.out.println("Enter Your Name : ");
        name=input.nextLine();
        System.out.println("Enter Roll Number : ");
        roll_no=input.nextInt();
        System.out.println("Enter Cgpa : ");
        cgpa=input.nextFloat();

        Student s1 = new Student(); //constructor 
        s1.insert_detail(roll_no, name, cgpa);
        s1.display_detail();
    }
}
