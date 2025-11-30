final class FinalClass {
    void display() {
        System.out.println("This is a final class");
    }
}

class ParentClass {
    final void finalMethod() {
        System.out.println("This is a final method");
    }
}

class ChildClass extends ParentClass {
    void show() {
        System.out.println("Child class method");
    }
}

public class Program20 {
    public static void main(String[] args) {
        final int FINAL_VAR = 100;
        System.out.println("Final variable: " + FINAL_VAR);
        
        FinalClass fc = new FinalClass();
        fc.display();
        
        ChildClass cc = new ChildClass();
        cc.finalMethod();
        cc.show();
    }
}
