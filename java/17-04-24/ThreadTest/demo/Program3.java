class Program {
    // Each thread that accesses a ThreadLocal variable has its own,
    // independently initialized copy of the variable.
    private static ThreadLocal<String> user = new ThreadLocal<>();

    private static void handleJob(int jid) {
        // here since we are using ThreadLocal we can get user using .get()
        System.out.printf("Thread<%x> has accepted job<%d> for %s%n", Thread.currentThread().hashCode(), jid,
                user.get());
        Activity.perform(jid);
        System.out.printf("Thread<%x> has finished job<%d> for %s%n", Thread.currentThread().hashCode(), jid,
                user.get());
    }

    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 1;
        Thread child = new Thread(() -> {
            // Here we need to set String to user
            // since we are using Local variable for each
            // thread using ThreadLocal.
            user.set("Benson");
            handleJob(n);
        });

        // In this .setDeamon() makes the child thread
        // run in background, so that JVM doesn't need to
        // wait till if completes execution.
        // if Main Thread completes the program early, then
        // the program will terminate without the child thread
        // being completely executed.
        if (n > 5)
            child.setDaemon(true);
        child.start();
        user.set("Samson");
        handleJob(10);
    }
}
