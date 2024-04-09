class Program {
    /*
     * Here we try to create a generic method
     * This accepts Objects(String, double, int, etc) as arguments
     * and returns Same Object type as return type.
     * This works only if all parameters and return type are of same type.
     */

    // private static Object select(int index, Object first, Object second) {
    /*
     * Now in the above code, Object is derived from Java.lang.Object() which
     * supports Primitive types. Now if someone passes any other type like
     * Interval, then the above code will throw an error.
     * In the below code <T> implies T is of generic type parameter and select
     * is generic method. The type T will be inferred based on the arguments
     * provided at the time of method invocation.
     */
    private static <T> T select(int index, T first, T second) {
        if ((index % 2) == 1)
            return first;
        return second;
    }

    /*
     * Here we extend Comparable so that we can use this Interface
     * for our generic method. We use here compareTo method.
     * But this gives the inbuilt comparision method. We must override
     * compareTo to our need.
     */
    private static <T extends Comparable> T select(T first, T second) {
        if (first.compareTo(second) > 0)
            return first;
        return second;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            // Here we get values from commandLine
            int s = Integer.parseInt(args[0]);
            /*
             * Here autoboxing happens, compiler implicitly converts
             * double(primitive type) to Object->Double(reference type) by
             * creating an instance of the Wrapper class of that primitive type.
             */
            String ss = (String) select(s, "Monday", "Tuesday");
            System.out.println("Selected String value: " + ss);
            double sd = (double) select(s, 43.5, 32.6);
            System.out.println("Selected value: " + sd);
        } else {
            String ss = select("Monday", "Tuesday");
            System.out.println("Selected Value: " + ss);
            /*
             * Here we define a datatype of Interval.While SOUTing si,
             * si is implicitly si.toString() which outputs Interval@(identity)
             * of the variable. We must override toString(from java.lang.Object) to
             * out need.
             */
            Interval si = select(new Interval(3, 45), new Interval(2, 30));
            System.out.println("Selected value: " + si);

            // This will throw error since our generic method
            // accepts Objects(String, double, int, etc) as arguments
            // and returns same Object as values
            // String s2 = (double)select(s, 42.4, 34.3);
        }
    }
}
