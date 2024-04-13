package MetTours;

public class TotalCost {
    static int discount = 0;

    /*
     * Here we calculate TotalCost using costPerDay and get discount depending
     * on the number of days and noPersons.
     */
    public static double totalCost(double costPerDay, int days, int noPersons) {
        discount += (days > 6 ? days * 100 : 0) + (noPersons >= 4 ? noPersons * 100 : 0);
        costPerDay *= days;
        return costPerDay -= discount;

    }
}
