class Employee {
    String name;
    int id;
    
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

class Manager extends Employee {
    String department;
    
    Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }
    
    void displayFunctionality() {
        display();
        System.out.println("Department: " + department);
        System.out.println("Functionality: Manages team and projects\n");
    }
}

class Developer extends Employee {
    String programmingLanguage;
    
    Developer(String name, int id, String programmingLanguage) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
    }
    
    void displayFunctionality() {
        display();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Functionality: Develops software applications\n");
    }
}

public class Program17 {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 101, "IT");
        Developer d = new Developer("Bob", 102, "Java");
        
        m.displayFunctionality();
        d.displayFunctionality();
    }
}
