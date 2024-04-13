package MetTours;

public class PremiumTours {

    /*
     * Here we calculate PerDayRent depending on the no of Persons.
     */

    @LuxuryTax(value = 10)
    public double getPerDayRentForCommon(int days, int noPersons) {
        return noPersons * 1200;
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
