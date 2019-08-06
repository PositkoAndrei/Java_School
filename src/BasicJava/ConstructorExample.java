package BasicJava;

class MyParent {
    MyParent(int i) {
        System.out.println("My Parent Constructor");
    }

    MyParent() {
        System.out.println("Default Constructor");
    }
}

public class ConstructorExample extends MyParent {
    ConstructorExample() {
        System.out.println("Constructor Example");
    }

    public static void main(String[] args) {
        new ConstructorExample();
    }
}

