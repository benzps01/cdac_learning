namespace MetTours;

public class PremiumTours
{
    static int discount = 0;

    public double GetPerDayRentForCommon(int Days, int NoOfPersons)
    {
        discount = (Days > 6 ? Days * 100 : 0) + (NoOfPersons >= 4 ? NoOfPersons * 100 : 0);
        return (NoOfPersons * 1200) - discount;
    }

    public double GetPerDayRentForSeniors(int Days, int NoOfPersons)
    {
        return GetPerDayRentForCommon(Days, NoOfPersons) - (NoOfPersons * 100);
    }

    public double GetPerDayRentForWomen(int Days, int NoOfPersons)
    {
        return GetPerDayRentForCommon(Days, NoOfPersons) - (NoOfPersons * 200);
    }
}