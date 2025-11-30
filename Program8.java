// Develop a Java program showing constructor overloading using a Person class.
//Provide constructors to initialize a person’s name, name & age, and name, age & city.
class Person {
    String name;
    int age;
    String city;
    
    Person(String name) {
        this.name = name;
    }
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    
    void display() {
        System.out.print("Name: " + name);
        if (age > 0) System.out.print(", Age: " + age);
        if (city != null) System.out.print(", City: " + city);
        System.out.println();
    }
}

public class Program8 {
    public static void main(String[] args) {
        Person p1 = new Person("John");
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30, "New York");
        
        p1.display();
        p2.display();
        p3.display();
    }
}
