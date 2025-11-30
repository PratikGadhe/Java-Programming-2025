//W.A.J.P. to declare a class Employee with data members:
//employee ID, employee name, salary, and a static department name.
//Use static methods to accept and display the details of three employees
import java.util.*;
class Emp{
    int emp_id;
    String emp_name;
    int salary;
    static String department;
    static void accept_detail(Emp e , Scanner sc){
        System.out.print("Employee ID: ");
        e.emp_id = sc.nextInt();
        sc.nextLine();
        System.out.print("Employee Name: ");
        e.emp_name = sc.nextLine();
        System.out.print("Salary: ");
        e.salary = sc.nextInt();
    }
    static void display_detail(Emp e){
        System.out.println("ID: " + e.emp_id + ", Name: " + e.emp_name + 
                           ", Salary: " + e.salary + ", Department: " + department);
    }
}
public class Employee {
    public static void main(String Args[]){
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        Emp e3 = new Emp();
        Scanner sc = new Scanner(System.in);
        Emp.department="IT";
        System.out.println("Enter details for Employee 1");
        Emp.accept_detail(e1, sc);
        Emp.accept_detail(e2, sc);
        Emp.accept_detail(e3, sc);
        Emp.display_detail(e1);
        Emp.display_detail(e2);
        Emp.display_detail(e3);
    }
}