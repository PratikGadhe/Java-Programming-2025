//W.A.J.P. to declare a class Employee with data members: employee ID, employee name, salary, and a static department name. 
//Use static methods to accept and display the details of three employees.
import java.util.Scanner;

class Employee {
    int employeeID;
    String employeeName;
    double salary;
    static String department;
    
    static void acceptDetails(Employee e, Scanner sc) {
        System.out.print("Employee ID: ");
        e.employeeID = sc.nextInt();
        sc.nextLine();
        System.out.print("Employee Name: ");
        e.employeeName = sc.nextLine();
        System.out.print("Salary: ");
        e.salary = sc.nextDouble();
    }
    
    static void displayDetails(Employee e) {
        System.out.println("ID: " + e.employeeID + ", Name: " + e.employeeName + 
                           ", Salary: " + e.salary + ", Department: " + department);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee.department = "IT";
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        
        System.out.println("Enter details for Employee 1:");
        Employee.acceptDetails(e1, sc);
        System.out.println("\nEnter details for Employee 2:");
        Employee.acceptDetails(e2, sc);
        System.out.println("\nEnter details for Employee 3:");
        Employee.acceptDetails(e3, sc);
        
        System.out.println("\nEmployee Details:");
        Employee.displayDetails(e1);
        Employee.displayDetails(e2);
        Employee.displayDetails(e3);
        
        sc.close();
    }
}
