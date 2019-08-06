package BasicJava;

public class Overload {
    int addTwoDigits(int a, int b) {
        return a + b;
    }

    double addTwoDigits(double a, double b) {
        return a + b;
    }


    public static void main(String[] args) {
        Overload overload = new Overload();
        OverloadChild overloadChild = new OverloadChild();
        System.out.println(overload.addTwoDigits(5, 6));
        System.out.println(overload.addTwoDigits(5.47, 8.85));
        overloadChild.addTwoDigits(5);
    }
}

class OverloadChild extends Overload {
    void addTwoDigits(int i) {
        System.out.println("Overload method");
    }
}

