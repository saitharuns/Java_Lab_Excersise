package javathurlab;

class ParentClass {
    public void print() {
        System.out.println("This is parent class");
    }
}

class ChildClass extends ParentClass {
    public void print() {
        System.out.println("This is child class");
    }
}

public class ParentAndChild {
    public static void main(String[] args) {
        ParentClass obj1 = new ParentClass();
        obj1.print();
        ChildClass obj2 = new ChildClass();
        obj2.print();
        ParentClass obj3 = new ChildClass();
        obj3.print();
    }
}