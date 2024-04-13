import java.util.*;

public class ShoppingCart {
    int listSize = 5;
    Collection<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public String printItem(int id) {
        for (Item item : items) {
            if (item.ID() == id) {
                return "Item " + item.ID() + " has " + item.getQuantity() + " items with Cost Per Unit "
                        + item.getCostPerUnit();
            }
        }
        return "Item Doesn't exist";
    }

    public void deleteItem(int id) throws ItemDoesntExistException {
        for (Item item : items) {
            if (item.ID() == id) {
                items.remove(item);
                break;
            } else {
                throw new ItemDoesntExistException();
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
