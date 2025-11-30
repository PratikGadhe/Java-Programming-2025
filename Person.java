// Develop a Java program showing constructor overloading using a Person class.
//Provide constructors to initialize a person’s name, name & age, and name, age & city.
class Person1{
    String name;
    int age;
    String city;
    Person1(String n){
        this.name=n;
    }
    Person1(String n,int age){
        this.name=n;
        this.age=age;
    }
    Person1(String n,int age,String city){
        this.name=n;
        this.age=age;
        this.city=city;
    }
    void display(){
            System.out.println("Name : "+name);
            if(age>0){
                System.out.println("Age : "+age);
            }
            if(city!=null){
                System.out.println("City : "+city);
            }
        }
}
public class Person {
    public static void main(String Args[]){
        Person1 p1 = new Person1("Pratik");
        Person1 p2 = new Person1("Aaditya",32);
        Person1 p3 = new Person1("Om",62,"Dhule");
        p1.display();
        p2.display();
        p3.display();
    }
}
