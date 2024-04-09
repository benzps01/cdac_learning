class Program {
    private static String select(int index, String first, String second) {
        if ((index % 2) == 1)
            return first;
        return second;
    }

    private static double select(int index, double first, double second) {
        if ((index % 2) == 1)
            return first;
        return second;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            // Here we get values from commandLine
            int s = Integer.parseInt(args[0]);
            String ss = select(s, "Monday", "Tuesday");
            System.out.println("Selected String value: " + ss);
            double sd = select(s, 43.5, 32.6);
            System.out.println("Selected double Value: " + sd);

            // This will give error since our method accepts Strings or double as arguments
            // and returns String or double
            // int si = select(s, "Jack", 2.3);
            // System.out.println("Selected Value: " + si);
        }
    }
}
