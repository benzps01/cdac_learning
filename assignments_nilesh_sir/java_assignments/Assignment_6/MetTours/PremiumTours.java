package MetTours;

public class PremiumTours {
    public double getPerDayRentForCommon(int days, int noPersons) {
        return noPersons * 1200;
    }

    public double getPerDayRentForSeniors(int days, int noPersons) {
        return getPerDayRentForCommon(days, noPersons) - 100;
    }

    public double getPerDayRentForWoman(int days, int noPersons) {
        return getPerDayRentForCommon(days, noPersons) - 200;
    }

}
