package Banking;

public class addLoanValues {

    public static void addValues(Loan[] loan, int count) {
        for (int i = 0; i < count; ++i) {
            loan[i].setPrinciple(dataValue.values[i][0]);
            loan[i].setPeriod(dataValue.values[i][1]);
        }

    }
}
