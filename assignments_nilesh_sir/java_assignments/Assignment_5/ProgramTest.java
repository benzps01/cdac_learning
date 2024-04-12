public class ProgramTest {
    public static void main(String[] args) {
        ShoppingCart s1 = new ShoppingCart();

        for (int i = 1; i < 6; i++) {
            System.out.println(s1.printItem(i));
        }

        System.out.println("Total Cart Price: " + s1.cartPrice());

        for (int i = 1; i < 6; i++) {
            System.out.println(s1.printItem(i));
        }

        // s1.deleteItem(2);

    }
}
