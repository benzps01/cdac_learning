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

    class Taxable
    {
    public:
        virtual double getTax() = 0;
    };

    class Discountable
    {
    public:
        virtual double getDiscount() = 0;
    };

    class PersonalLoan : public Loan, public Taxable
    {
    public:
        float GetRate()
        {
            return GetPrinciple() <= 500000 ? 0.15 : 0.16;
            ;
        }

        double getTax()
        {
            if (GetEMI() > 800)
            {
                return GetEMI() * 0.05;
            }
            return 0;
        }
    };
    class HomeLoan : public Loan, public Discountable
    {
    public:
        HomeLoan() : limit(250000.0)
        {
        }
        float GetRate()
        {
            if (GetPrinciple() >= limit)
            {
                return GetPrinciple() <= 2000000 ? 0.11 : 0.12;
            }
            return GetPrinciple() <= 2000000 ? 0.10 : 0.11;
        }

        double getDiscount()
        {
            if (GetEMI() > 700)
            {
                return GetEMI() * 0.05;
            }
            return 0;
        }

    private:
        float limit;
    };

}
