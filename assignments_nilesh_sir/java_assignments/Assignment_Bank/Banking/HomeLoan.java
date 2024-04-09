package Banking;

public class HomeLoan extends Loan implements Discountable {
    private double limit = 250000.0;

    public double getRate() {
        if (this.getPrinciple() >= limit) {
            return this.getPrinciple() >= 2000000.0 ? 0.11 : 0.12;
        } else {
            return this.getPrinciple() >= 2000000.0 ? 0.10 : 0.11;
        }
    }

    public double getDiscount() {
        return this.getEMI() > 1500.0 ? this.getEMI() * 0.05 : 0.0;
    }
}
