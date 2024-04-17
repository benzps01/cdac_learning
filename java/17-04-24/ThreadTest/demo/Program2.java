class Program {
    private static String user;

    private static void handleJob(int jid) {
        System.out.printf("Thread<%x> has accepted job<%d> for %s%n", Thread.currentThread().hashCode(), jid, user);
        Activity.perform(jid);
        System.out.printf("Thread<%x> has finished job<%d> for %s%n", Thread.currentThread().hashCode(), jid, user);
    }

    public static void main(String[] args) {
        // Here we create a child thread which is separate from
        // Main thread. By this we can run multiple handleJob
        // function together.

        // But here user is overriden by the child. Hence
        // the child user is written for the Main thread user
        // too.
        Thread child = new Thread(() -> {
            user = "Benson";
            handleJob(5);
        });
        child.start();
        user = "Samson";
        handleJob(15);
    }
}
