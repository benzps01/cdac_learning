package Banking;

public class HomeLoan extends Loan {
    public double getRate() {
        return getPrinciple() >= 2000000 ? 0.10 : 0.11;
    }
}
