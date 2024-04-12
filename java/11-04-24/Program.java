import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        /*
         * Here we instantiate a new Printer object
         * where we specify the type of object we need to work on.
         * 
         * Now we could create a Array of objects instead of generics.
         * But this won't be type safe.'
         * Generics don't work with primitive types
         * We need wrapper classes for them to work.
         */
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(33.5);
        doublePrinter.print();

        /*
         * Just having Object as generic will give type safety issue since
         * Dog is not same as Cat Object;
         */
        // ArrayList<Object> cats = new ArrayList<>();
        // cats.add(new Cat());
        // cats.add(new Dog());

        // Cat mycat = (Cat) cats.get(0);

        /*
         * Now if we provide Cat as type we don't need to Cast is to Cat object
         * everything we need to call something
         */

        // shout("John", 75);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

    }

    // private static <T, V> void shout(T thingToShout, V otherThingToShout) {
    // System.out.println(thingToShout + "!!!!!");
    // System.out.println(otherThingToShout + "!!!!!");
    // }

    // private static <T, V> T shout(T thingToShout, V otherThingToShout) {
    // System.out.println(thingToShout + "!!!!!");
    // System.out.println(otherThingToShout + "!!!!!");
    // return thingToShout;
    // }

    // This won't work since List of Objects is not same as
    // List of Integers, Hence we need ? => wildcard
    // This means that we can accept any type user gives us.
    // here we can also extend <? extends Animal> This means accept those types
    // which has Animal in it.
    private static void printList(List<?> myList) {
        System.out.println();
    }

}
