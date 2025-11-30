import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int marks1;
    int marks2;
    
    Student(int rollNumber, String name, int marks1, int marks2) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }
    
    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Total: " + (marks1 + marks2));
    }
}

public class Program6 {
    public static void main(String[] args) {
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
        
        Student s = new Student(roll, name, m1, m2);
        System.out.println("\nStudent Details:");
        s.display();
        
        sc.close();
    }
}
