package demo;

public class Activity {
    public static long perform(int count) {
        long future = System.currentTimeMillis() + 100 * count;
        // Execute this while the count logic terminates.
        while(System.currentTimeMillis() < future);
        // after termination, return this value
        return count * count;
    }
}
