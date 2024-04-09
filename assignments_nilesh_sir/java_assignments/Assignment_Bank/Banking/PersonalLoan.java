package Banking;

public class PersonalLoan extends Loan implements Taxable {
    public PersonalLoan() {
    }

    public double getRate() {
        return getPrinciple() >= 500000 ? 0.15 : 0.16;
    }

    public double getTax() {
        return getEMI() > 1500 ? getEMI() * 0.05 : 0.0;
    }
}
