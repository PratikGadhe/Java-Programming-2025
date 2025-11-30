class Student{
    int roll;
    String name;
    void insert(int r,String n){
        roll = r;
        name = n;
    }
    void display(){
        System.out.println("Roll Number : "+ roll +"\nName : "+name);
    }
}
public class Main1{
    public static void main(String Args[]){
        Student s1 = new Student();
        s1.insert(57,"pratik");
        s1.display();
    }
}
