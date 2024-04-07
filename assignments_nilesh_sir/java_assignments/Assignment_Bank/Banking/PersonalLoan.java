package Banking;

public class PersonalLoan extends Loan {

    public double getRate() {
        return getPrinciple() >= 500000 ? 0.15 : 0.16;
    }
}
