public class Activity {
    public static void perform(int count) {
        // This will run untill the certain amount of seconds has passed....
        long future = System.currentTimeMillis() + 1000 * count;
        while (System.currentTimeMillis() < future)
            ;
    }
}