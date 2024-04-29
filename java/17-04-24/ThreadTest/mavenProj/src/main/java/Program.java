import Threads.*;

class Program {
    static class JointAccount {
        private int balance;

        public int balance() {
            return balance;
        }

        public boolean withdraw(int amount) {
            boolean success = false;
            if (balance >= amount) {
                balance = Activity.perform(balance, amount, -1);
                success = true;
            }
            return success;
        }

        public void deposit(int amount) {
            balance = Activity.perform(balance, amount, 1);
        }
    }

    public static void main(String[] args) throws Exception {
        var acc = new JointAccount();
        acc.deposit(Integer.parseInt(args[0]));
        System.out.println("Joint Account Opened");
        System.out.println("Initial Balance: " + acc.balance());
        Thread child1 = new Thread(() -> {
            System.out.println("Jack is withdrawing 6000.....");
            if (!acc.withdraw(7000)) {
                System.out.println("Jack's withdraw operation failed");
            } else {
                System.out.println("Jack withdraw done..!!");
            }
        });

        Thread child2 = new Thread(() -> {
            System.out.println("Jill is withdrawing 6000.....");
            if (!acc.withdraw(6000)) {
                System.out.println("Jill's withdraw operation failed");
            } else {
                System.out.println("Jill withdraw done..!!");
            }
        });

        child1.start();
        child2.start();
        child1.join();
        System.out.println("Current Balance: " + acc.balance());
    }
}
