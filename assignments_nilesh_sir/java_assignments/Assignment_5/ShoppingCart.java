import java.util.*;

public class ShoppingCart {
    int listSize = 5;
    Collection<Item> items = new ArrayList<>();

    ShoppingCart() {
        // items = new ArrayList<>();
        items.add(new Item(150, 25));
        items.add(new Item(90, 10));
        items.add(new Item(75, 12));
        items.add(new Item(220, 18));
        items.add(new Item(100, 50));
    }

    public String printItem(int id) {
        for (Item item : items) {
            // System.out.println("This " + item.ID());
            if (item.ID() == id) {
                return "Item " + item.ID() + " has " + item.getQuantity() + " items with Cost Per Unit "
                        + item.getCostPerUnit();
            }
        }
        return "Item Doesn't exist";
    }

    public void deleteItem(int id) {
        for (Item item : items) {
            if (item.ID() == id) {
                items.remove(item);
                break;
            }
        }
    }

    public double cartPrice() {
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.sellingPrice();
        }
        if (totalCost > 50000) {
            return totalCost - (totalCost * 0.05);
        }
        if (totalCost > 100000) {
            return totalCost - (totalCost * 0.10);
        }
        return totalCost;
    }

}
