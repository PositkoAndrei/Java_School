package BasicJava;

public class Methods {
    static int numbers() {
        return 5;

        //abstract final strictfp  native synchronized
        //static void numbers(int i, float f, boolean b, Object o, String s, int... j) {
        // System.out.println(i);
        // System.out.println(f);
        //  System.out.println(b);
        //  System.out.println(o);
        // System.out.println(s);
        //for (int k : j) {
        //    System.out.println(k);

        //}
    }
}


//class Method2 { //возвращаемые методы
//  static Object ExMethod() {
//    return new Object();
// }


class Example extends Methods {
    public static void main(String[] args) {
        System.out.println(Methods.numbers());
       // Methods.numbers(5, 4.25f, true, new Object(), "Hello", 5, 5, 8, 85, 756, 96, 28, 758);
    }
}
