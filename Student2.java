//W. A. J. P. to declare a class Student having data members roll number, name, marks1amd marks2.
//Initialize the object using constructor. Accept the data and display it.

import java.util.Scanner;

class Student {
    int roll;
    String name;
    int marks1;
    int marks2;
    Student(int r,String n,int m1,int m2){
        this.roll=r;
        this.name=n;
        this.marks1=m1;
        this.marks2=m2;
    }
    void display(){
        System.out.println("Roll Number : "+roll);
        System.out.println("Student name : "+name);
        System.out.println("Marks 1 :"+marks1);
        System.out.println("Marks 2 :"+marks2);
    }
}
public class Student2{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Marks1: ");
        int m1 = sc.nextInt();
        System.out.print("Marks2: ");
        int m2 = sc.nextInt();
        Student s1 = new Student(roll,name,m1,m2);
        s1.display();

    }
}
