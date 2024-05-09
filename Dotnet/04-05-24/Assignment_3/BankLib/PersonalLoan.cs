namespace BankLib
{
    sealed class PersonalLoan : Loan, ITaxable
    {
        public override double GetRate()
        {
            double lowerlimit = 300000;
            double upperlimit = 2500000;
            double rate = Principle >= 500000 ? 0.15 : 0.16;
            if (Principle < lowerlimit)
            {
                return rate += 0.01;
            }
            else if (Principle > upperlimit)
            {
                return rate += 0.02;
            }
            else
            {
                return rate;
            }
        }

        public double GetTax()
        {
            return GetEmi() * 0.10;
        }
    }
}