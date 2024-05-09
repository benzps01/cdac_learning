
import java.util.*;

public class ShoppingCart {
    Collection<Item> items = new ArrayList<>();

    public boolean addItem(Item item) {
        if (!items.contains(item.getItemId())) {
            items.add(item);
            return true;
        }
        return false;
    }

    public void displayItem() {
        for (Item item : items) {
            System.out.println("Item id " + item.getItemId() + " and Item name is " + item.getItemName());
        }
    }
}