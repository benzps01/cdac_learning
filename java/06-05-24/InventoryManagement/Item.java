
public class Item {
    private int itemId;
    private String itemName;

    Item(int id, String name) {
        itemId = id;
        itemName = name;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

}
