class Program {
    // Here we try to create a generic method
    // This accepts Objects(String, double, int, etc) as arguments
    // and returns Same Object type as return type.
    // This works only if all parameters and return type are of same type.
    private static Object select(int index, Object first, Object second) {
        if ((index % 2) == 1)
            return first;
        return second;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            // Here we get values from commandLine
            int s = Integer.parseInt(args[0]);
            // Here autoboxing happens, compiler implicitly converts double(primitive type)
            // to Object->Double(reference type) by creating an instance of the Wrapper
            // class
            // of that primitive type.
            String ss = (String) select(s, "Monday", "Tuesday");
            System.out.println("Selected String value: " + ss);
            double sd = (double) select(s, 43.5, 32.6);
            System.out.println("Selected value: " + sd);

            // This will throw error since our generic method
            // accepts Objects(String, double, int, etc) as arguments
            // and returns same Object as values
            // String s2 = (double)select(s, 42.4, 34.3);
        }
    }
}
