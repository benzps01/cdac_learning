public class Item {
    private int ID;
    private static int nextID = 1;
    private float CostPerUnit;
    private int quantity;

    Item(float CostPerUnit, int quantity) {
        this.ID = nextID++;
        this.CostPerUnit = CostPerUnit;
        this.quantity = quantity;
    }

    public void setCostPerUnit(float CostPerUnit) {
        this.CostPerUnit = CostPerUnit;
    }

    public float getCostPerUnit() {
        return this.CostPerUnit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getQuantity() {
        return this.quantity;
    }

    public int ID() {
        return ID;
    }

    public float sellingPrice() {
        return CostPerUnit * quantity + 20;
    }

}