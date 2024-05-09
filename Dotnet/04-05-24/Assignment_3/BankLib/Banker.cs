namespace BankLib
{
    public static class Banker
    {
        public static Loan GetHomeLoan()
        {
            return new HomeLoan();
        }

        public static Loan GetPersonalLoan()
        {
            return new HomeLoan();
        }
    }
}