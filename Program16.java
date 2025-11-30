// Base class
class Employee {
    int empId;
    String name;

    void getEmployeeDetails(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }
}

// Derived class from Employee
class TeamLead extends Employee {
    int teamSize;

    void getTeamLeadDetails(int teamSize) {
        this.teamSize = teamSize;
    }

    void displayTeamLead() {
        System.out.println("Team Size: " + teamSize);
    }
}

// Derived class from TeamLead
class Manager extends TeamLead {
    String department;

    void getManagerDetails(String department) {
        this.department = department;
    }

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

// Main class
public class Program16 {
    public static void main(String[] args) {

        Manager m = new Manager();

        m.getEmployeeDetails(101, "Pratik");
        m.getTeamLeadDetails(10);
        m.getManagerDetails("IT Department");

        System.out.println("----- Employee Details -----");
        m.displayEmployee();

        System.out.println("----- TeamLead Details -----");
        m.displayTeamLead();

        System.out.println("----- Manager Details -----");
        m.displayManager();
    }
}
