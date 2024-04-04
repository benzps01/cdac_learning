namespace bank
{
    class Loan
    {
    public:
        double GetPrinciple()
        {
            return principle;
        }
        void SetPrinciple(double amount)
        {
            principle = amount;
        }
        float GetPeriod()
        {
            return period;
        }
        void SetPeriod(float p)
        {
            period = p;
        }
        virtual float GetRate() = 0;

        double GetEMI()
        {
            return principle * (1 + GetRate() * period / 100) / (12 * period);
        }

    private:
        double principle;
        float period;
    };
    class PersonalLoan : public Loan
    {
    public:
        // float rate = GetPrinciple() <= 500000 ? 0.15 : 0.16;
        float GetRate()
        {
            return GetPrinciple() <= 500000 ? 0.15 : 0.16;
            ;
        }
    };
    class HomeLoan : public Loan
    {
    public:
        float rate = GetPrinciple() <= 2000000 ? 0.10 : 0.11;
        float GetRate()
        {
            return rate;
        }
    };
}
