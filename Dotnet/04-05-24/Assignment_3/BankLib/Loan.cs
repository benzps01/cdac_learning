namespace BankLib{

public abstract class Loan{
    public double Principle {get;set;}

    public int Period {get; set;}

    public abstract double GetRate();

    public double GetEmi(){
        return Principle * (1 + GetRate() * Period / 100)/(12 * Period);
    }
}
}