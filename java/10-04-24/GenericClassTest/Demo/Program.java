class Program {
    public static void main(String[] args) {
        /*
         * Here the 2nd <> at RHS automatically is made String
         * since LHS is String. No need to explicitly write String
         */
        SimpleStack<String> a = new SimpleStack<>();
        a.push("Monday");
        a.push("Tuesday");
        a.push("Wednesday");
        a.push("Thursday");
        a.push("Friday");
        while (!a.empty()) {
            System.out.println(a.pop());
        }
        System.out.println("------------------------------");
        SimpleStack<Interval> I = new SimpleStack<>();
        I.push(new Interval(4, 35));
        I.push(new Interval(6, 12));
        I.push(new Interval(5, 78));
        I.push(new Interval(3, 67));
        while (!I.empty()) {
            System.out.println(I.pop());
        }

    }
}