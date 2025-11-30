interface Sports {
    void sportsActivity();
}

interface Studies {
    void studyDetails();
}

class Student implements Sports, Studies {
    String name;
    int rollNo;
    String sport;
    String course;

    Student(String name, int rollNo, String sport, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.sport = sport;
        this.course = course;
    }

    @Override
    public void sportsActivity() {
        System.out.println("Sports Activity: " + sport);
    }

    @Override
    public void studyDetails() {
        System.out.println("Course: " + course);
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        sportsActivity();
        studyDetails();
    }
}

public class Program19 {
    public static void main(String[] args) {

        Student s = new Student("Alice", 101, "Badminton", "Computer Science");

        s.display();  // Shows all details
    }
}