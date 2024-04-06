public class MathUtil {

    int count = 0;

    public int countPrime(int n1, int n2) {
        for (int i = n1; i < n2; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        if (num == 2 || num == 3 || num == 5) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
            return false;
        }
        for (int i = 5; i < num / 2; i += 6) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int subtract(int n1, int n2) {
        return n1 - n2;
    }

    public int multiply(int n1, int n2) {
        return n1 * n2;
    }
}