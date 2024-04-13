import java.util.Scanner;

public class ProgramTest {
    public static void main(String[] args) {
        Scanner cartObj = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();

        System.out.println("Enter the Cart Size: ");
        int cartSize = cartObj.nextInt();
        cartObj.nextLine();

        try {
            for (int i = 1; i <= cartSize; i++) {
                System.out.println("Enter the CostPerUnit");
                int cp = cartObj.nextInt();
                System.out.println();
                System.out.println("Enter the Quantity");
                int quant = cartObj.nextInt();
                System.out.println();
                cart.addItem(new Item(cp, quant));
            }

            for (int i = 1; i <= cartSize; i++) {
                System.out.println(cart.printItem(i));
            }

            System.out.println("Total Cart Price: " + cart.cartPrice());
            System.out.println();

            try {
                System.out.println("Enter Id to be deleted: ");
                int id = cartObj.nextInt();
                cart.deleteItem(id);
            } catch (ItemDoesntExistException e) {
                System.out.println("There is no such Item. Check your ID!!!!");
                System.out.println();
            }

            for (int i = 1; i <= cartSize; i++) {
                System.out.println(cart.printItem(i));
            }
        } finally {
            cartObj.close();
        }

    }
}
