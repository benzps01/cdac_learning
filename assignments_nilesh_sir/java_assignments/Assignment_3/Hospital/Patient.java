package Hospital;

import Hospital.BedOptions;

public class Patient {
    private static int patientId;
    private String patientName;
    private BedOptions bedType;
    private int noOfDays;

    public Patient() {
        patientId++;
        bedType = BedOptions.ECONOMICAL;
    }

    public int getId() {
        return patientId;
    }

    public void setName(String name) {
        patientName = name;
    }

    public void setNoOfDays(int days) {
        noOfDays = days;
    }

    public String getName() {
        return patientName;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setBed(BedOptions bed) {
        bedType = bed;
    }

    public int getPricePerDay() {
        switch (bedType) {
            case EXECUTIVE:
                return 500;
            case SPECIAL:
                return 350;
            default:
                return 200;
        }
    }

    public double getBillAmount() {
        double amount;
        amount = getNoOfDays() * getPricePerDay();
        return amount;
    }
}
