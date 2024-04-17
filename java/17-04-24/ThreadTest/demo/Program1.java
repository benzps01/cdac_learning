class Program {
    private static String user;

    private static void handleJob(int jid) {
        System.out.printf("Thread<%x> has accepted job<%d> for %s%n", Thread.currentThread().hashCode(), jid, user);
        Activity.perform(jid);
        System.out.printf("Thread<%x> has finished job<%d> for %s%n", Thread.currentThread().hashCode(), jid, user);
    }

    // Here we run handleJob on the MainThread.
    // Only after 1 function has finished his work, will the next thread execute.
    public static void main(String[] args) {
        user = "Benson";
        handleJob(5);
        user = "Samson";
        handleJob(2);
    }
}