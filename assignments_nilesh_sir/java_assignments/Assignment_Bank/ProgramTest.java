import Banking.*;

public class ProgramTest {

    public static void printAll(Loan[] loans) {
        for (int i = 0; i < loans.length; i++) {
            if (loans[i] instanceof HomeLoan) {
                System.out.println("HomeLoan Details: ");
            } else if (loans[i] instanceof PersonalLoan) {
                System.out.println("PersonalLoan Details: ");
            }
            System.out.println("Principle Amount: " + loans[i].getPrinciple());
            System.out.println("Invested for a period of: " + loans[i].getPeriod());
            System.out.println("Rate: " + loans[i].getRate());
            System.out.println("EMI: " + String.format("%.2f", loans[i].getEMI()));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Loan[] loan = new Loan[3];

        loan[0] = new HomeLoan();
        loan[1] = new PersonalLoan();
        loan[2] = new HomeLoan();

        loan[0].setPrinciple(1243121);
        loan[0].setPeriod(18);

        printAll(loan);

    }
}
