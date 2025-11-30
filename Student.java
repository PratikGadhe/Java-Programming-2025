/*W. A. J. P. to declare a class Student having data members roll number, name, marks1amd marks2.
 Accept the data for 2 objects and display the total marks for each subject.
 */
public class Student {
    int roll_no;
    String name;
    float marks1,marks2;
    void get(int r , String n,int m1,int m2){
        roll_no = r;
        name = n;
        marks1 = m1;
        marks2 = m2;
    }
    void display(){
        System.out.println("Roll No : "+roll_no);
        System.out.println("Name : "+name);
        System.out.println("Marks 1 : "+marks1);
        System.out.println("Marks 2 : "+marks2);
    }
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.get(1,"Pratik Gadhe",90,80);
        obj1.display();

        Student obj2 = new Student();
        obj2.get(2,"Sanket Gadhe",91,90);
        obj2.display();
    }
}
