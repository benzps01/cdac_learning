namespace BankLib
{

    sealed class HomeLoan : Loan, IDiscountable
    {

        double limit = 0;
        public HomeLoan()
        {
            limit = 2500000;
        }
        public override double GetRate()
        {
            double rate = Principle <= 2000000 ? 0.10 : 0.11;
            return Principle > limit ? rate += 0.01 : rate;
        }

        public double GetDiscount()
        {
            return GetEmi() * 0.05;
        }
    }
}