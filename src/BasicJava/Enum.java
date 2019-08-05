package BasicJava;

public class Enum {
    enum CoffeeSize {//in class and out of class. Not in the method!
        SMALL(100), MEDIUM(200), BIG(300) {
            String getCoffeeClass() { //For BIG we redefine this class
                return "B";
            }
        };

        String coffeeClass = "A";
        int milliliters;

        CoffeeSize(int milliliters) {
            this.milliliters = milliliters;
        }

        int getMilliliters() {
            return milliliters;
        }

        String getCoffeeClass() {
            return coffeeClass;
        }
    }

    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.BIG;
        System.out.println(coffeeSize);
        System.out.println(coffeeSize.getMilliliters());
        System.out.println(coffeeSize.getCoffeeClass());
    }
}


//class CoffeeSize2 {
//public static final CoffeeSize2 SMALL = new CoffeeSize2();
//public static final CoffeeSize2 MEDIUM = new CoffeeSize2();
//public static final CoffeeSize2 BIG = new CoffeeSize2();
//}
