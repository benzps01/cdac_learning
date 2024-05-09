
public class Program {
    public static void main(String[] args) {
        ShoppingCart s1 = new ShoppingCart();
        System.out.println(s1.addItem(new Item(10, "Apple")));
        s1.displayItem();
    }
}
