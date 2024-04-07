package Hospital;

public class InHousePatient extends Patient {

    private double discount = 0.05;

    public double getBillAmount() {
        double billAmount = super.getBillAmount();
        if (super.getBillAmount() >= 5000) {
            return super.getBillAmount() - (billAmount * discount);
        }
        return billAmount;
    }
}
