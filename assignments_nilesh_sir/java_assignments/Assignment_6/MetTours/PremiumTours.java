package MetTours;

public class PremiumTours {
    static int discount = 0;
    /*
     * Here we calculate PerDayRent depending on the no of Persons.
     */

    @LuxuryTax(value = 10)
    public double getPerDayRentForCommon(int days, int noPersons) {
        discount += (days > 6 ? days * 100 : 0) + (noPersons >= 4 ? noPersons * 100 : 0);
        return (noPersons * 1200) - discount;
    }

    @LuxuryTax(value = 10)
    public double getPerDayRentForSeniors(int days, int noPersons) {
        return getPerDayRentForCommon(days, noPersons) - 100;
    }

    @LuxuryTax(value = 10)
    public double getPerDayRentForWoman(int days, int noPersons) {
        return getPerDayRentForCommon(days, noPersons) - 200;
    }

}
