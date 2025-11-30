//W. A. J. P. to declare a class Student having data members roll number, name, marks1amd marks2.
// Accept the data for 2 objects and display the total marks for each subject.

import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int marks1;
    int marks2;
}

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        
        System.out.println("Enter details for Student 1:");
        System.out.print("Roll Number: ");
        s1.rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        s1.name = sc.nextLine();
        System.out.print("Marks1: ");
        s1.marks1 = sc.nextInt();
        System.out.print("Marks2: ");
        s1.marks2 = sc.nextInt();
        
        System.out.println("\nEnter details for Student 2:");
        System.out.print("Roll Number: ");
        s2.rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        s2.name = sc.nextLine();
        System.out.print("Marks1: ");
        s2.marks1 = sc.nextInt();
        System.out.print("Marks2: ");
        s2.marks2 = sc.nextInt();
        
        System.out.println("\nStudent 1 - " + s1.name + ": Total Marks = " + (s1.marks1 + s1.marks2));
        System.out.println("Student 2 - " + s2.name + ": Total Marks = " + (s2.marks1 + s2.marks2));
        
        sc.close();
    }
}
