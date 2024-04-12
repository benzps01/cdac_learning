package MetTours;

public class TotalCost {
    static int discount = 0;

    public static double totalCost(double cost, int days, int noPersons) {
        discount += (days > 6 ? days * 100 : 0) + (noPersons >= 4 ? noPersons * 100 : 0);
        cost *= days;
        return cost -= discount;

    }
}
