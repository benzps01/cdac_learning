public class MathUtil {
    private int number1, number2;

    MathUtil(int n1, int n2) {
        number1 = n1;
        number2 = n2;
    }

    boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2 || n == 3 || n == 5) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
            return false;
        }
        for (int i = 5; i < n / 2; i += 6) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    int countPrimes() {
        int count = 0;
        for (int i = number1; i < number2; i++) {
            if (isPrime(i))
                count++;
        }
        return count;
    }

    int addition() {
        return number1 + number2;
    }

    int subtraction() {
        return number2 - number1;
    }

    int multiply() {
        return number1 * number2;
    }
}
