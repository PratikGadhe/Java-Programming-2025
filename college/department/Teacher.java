package college.department;

public class Teacher {
    public int id;
    public String name;
    public String department;
    public String className;
    
    public Teacher(int id, String name, String department, String className) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.className = className;
    }
    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Class: " + className);
    }
}
