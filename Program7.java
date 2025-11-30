import java.util.Scanner;

class Employee {
    String employeeName;
    int employeeID;
    
    Employee(String name, int id) {
        this.employeeName = name;
        this.employeeID = id;
    }
    
    Employee(Employee e) {
        this.employeeName = e.employeeName;
        this.employeeID = e.employeeID;
    }
    
    void display() {
        System.out.println("ID: " + employeeID + ", Name: " + employeeName);
    }
}

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Employee ID: ");
        int id = sc.nextInt();
        
        Employee e1 = new Employee(name, id);
        Employee e2 = new Employee(e1);
        
        System.out.println("\nEmployee 1:");
        e1.display();
        System.out.println("\nEmployee 2 (copied):");
        e2.display();
        
        sc.close();
    }
}
