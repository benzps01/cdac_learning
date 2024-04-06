public class test {

    public static void main(String[] args) {
        MathUtil m1 = new MathUtil(2, 100);

        System.out.println("No of Primes: " + m1.countPrimes());
        System.out.println("Addition is: " + m1.addition());
        System.out.println("Subtraction is: " + m1.subtraction());
        System.out.println("Multiply: " + m1.multiply());
    }
}
