//W. A. J. P. to declare a class Employee having data members Employee name and ID.
//Initialize the values from one object to another object.
//Accept the data and display it.
import java.util.*;
class Employee {
    int emp_id;
    String name;
    Employee(int emp,String name){
        this.emp_id=emp;
        this.name=name;
    }
    Employee(Employee e){
        this.emp_id=e.emp_id;
        this.name=e.name;
    }
    void display(){
        System.out.println("Employee id : "+emp_id);
        System.out.println("Employee name : "+name);
    }
}
public class Employee1{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter ID : ");
        int id = sc.nextInt();
        System.out.printf("Enter Name : ");
        String name = sc.next();
        Employee e1 = new Employee(id,name);
        Employee e2 = new Employee(e1);
        System.out.println("--Employee Detail--");
        e1.display();
        e2.display();
    }
}

