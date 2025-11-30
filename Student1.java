//W. A. J. P. to declare a class Student having data members roll number, name, marks1 and marks2.
//Accept the data for 2 objects and display the total marks for each subject.

import java.util.*;
class Student {
    int roll;
    String name;
    int marks1;
    int marks2;
    void insert(int r,String n,int m1,int m2){
        roll=r;
        name=n;
        marks1=m1;
        marks2=m2;
    }
    void display(){
        System.out.println("Roll Number : "+roll);
        System.out.println("Student Name : "+name);
        System.out.println("Marks 1 : "+marks1);
        System.out.println("Marks 2 : "+marks2);
    }
}
public class Student1{
    public static void main(String Args[]){
        int roll,marks1,marks2;
        String name;
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.printf("Enter Roll Number : ");
        s1.roll=sc.nextInt();
        System.out.printf("Enter Student Name : ");
        s1.name=sc.next();
        System.out.print("Marks1: ");
        s1.marks1 = sc.nextInt();
        System.out.print("Marks2: ");
        s1.marks2 = sc.nextInt();
        System.out.printf("Enter Roll Number : ");
        s2.roll=sc.nextInt();
        System.out.printf("Enter Student Name : ");
        s2.name=sc.next();
        System.out.print("Marks1: ");
        s2.marks1 = sc.nextInt();
        System.out.print("Marks2: ");
        s2.marks2 = sc.nextInt();
        s1.insert(s1.roll,s1.name,s1.marks1,s1.marks2);
        s1.display();
    }
}
