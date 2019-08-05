package BasicJava;

public class Constr { //name = name Class
    int i;

    Constr(String Hi, int i) { //not final, abstract, static
        this.i = i;
        System.out.println("Two types of parameters");
        System.out.println(Hi);
        System.out.println(i);
    }

    Constr() {
        System.out.println("With no parameters");
    }

    Constr(int i) {
        this.i = i;
        System.out.println("With int");
        //System.out.println(i);
    }
}

class Run {
    public static void main(String[] args) {
        Constr constr = new Constr("My name is Andrey", 5);
        //Constr constr = new Constr();
        //Constr constr = new Constr(256);
        System.out.println(constr.i); //Will be 5 and 5)

    }
}